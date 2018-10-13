package com.nsd.noa.cxf.service

import com.nsd.noa.cxf.service.communication.EmailClient
import com.nsd.noa.cxf.service.data.EmailContent
import com.nsd.noa.cxf.service.util.*
import com.nsd.noa.schema.MsgStatus
import com.nsd.noa.schema.PostResponse
import com.nsd.noa.schema.PostRq
import com.nsd.noa.schema.PostRs
import com.nsd.noa.service.NoaLinkService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NoaLinkServiceImpl(@Autowired val email: EmailClient, @Autowired val logger : LoggingServiceImpl) : NoaLinkService {

    override fun postRequest(postRq: PostRq): PostResponse {

        val emailResponse = try { val acord = postRq.workFolder.msgFile.fileId.toStringContent(); email.send(EmailContent(
                subject = acord.toEmailSubject(),
                body = acord.toEmailBody(),
                attachments = postRq.workFolder.attachmentPackages.toEmailAttachments(),
                sendTo = postRq.receiver.partyId
        )) } catch (exc : Exception) {
            logger.log("Exception Message : " + exc.message)
            logger.logException(exc)
            false
        }

        return response(postRq, emailResponse)
    }

    private fun response(message: PostRq, emailResponse: Boolean): PostResponse =
            PostResponse().apply {
                response = PostRs().apply {
                    sender = message.sender
                    receiver = message.receiver
                    msgStatus = MsgStatus().apply {
                        msgStatusCd = when (emailResponse) { true -> "SUCCESS"
                            else -> "FAILED"
                        }
                        msgStatusDescription = "Email ${when (emailResponse) { true -> "Sent Successfully"
                            else -> "was not sent successfully"
                        }}. Thank you for using the service!!"
                    }
                }
            }

}