package com.nsd.noa.cxf.service.communication

import com.nsd.noa.cxf.service.data.EmailContent
import com.nsd.noa.cxf.service.util.LoggingServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.activation.DataHandler
import javax.mail.Message
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeBodyPart
import javax.mail.internet.MimeMessage
import javax.mail.internet.MimeMultipart
import javax.mail.util.ByteArrayDataSource


@Component("email-client")
class EmailClient(@Autowired @Value("\${mail.host}") val mailHost: String,
                  @Autowired @Value("\${mail.user}") val user: String,
                  @Autowired @Value("\${mail.password}") val password: String,
                  @Autowired @Value("\${mail.from}") val from: String,
                  @Autowired val logger: LoggingServiceImpl) {

    fun send(emailDetails: EmailContent): Boolean {

        /* Create Email Client */
        val message = createEmailMessage()
        message.subject = emailDetails.subject
        message.addRecipient(Message.RecipientType.TO, InternetAddress(emailDetails.sendTo))

        /* Create Email Body */
        val messageBodyPart = MimeBodyPart()
        messageBodyPart.setText(emailDetails.body)

        val multipart = MimeMultipart()
        multipart.addBodyPart(messageBodyPart)

        /* Adding email Attachment */
        emailDetails.attachments.forEach {
            logger.log("Attachment ${it.fileName} -- ${it.mimeType} & content type ${it.content.contentType} and name is ${it.content.name}")
            val attachment = MimeBodyPart()
            attachment.fileName = it.fileName
            attachment.dataHandler = reCreateDataHandler(it.content, it.mimeType)
            multipart.addBodyPart(attachment)
        }

        /* Send email */
        message.setContent(multipart)
        Transport.send(message)
        logger.log("Email Sent successfully to ${emailDetails.sendTo}")
        return true
    }

    private fun reCreateDataHandler(content: DataHandler, mimeType: String) = DataHandler(ByteArrayDataSource(content.inputStream, mimeType))

    fun createEmailMessage(): MimeMessage {

        val properties = System.getProperties()
        properties.setProperty("mail.smtp.host", mailHost)
        properties.setProperty("mail.user", user)
        properties.setProperty("mail.password", password)
        val session = Session.getDefaultInstance(properties)
        val message = MimeMessage(session)
        message.setFrom(InternetAddress(from))
        return message
    }


}
