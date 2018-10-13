package com.nsd.noa.cxf.service.util

import com.nsd.noa.cxf.service.data.*
import com.nsd.noa.cxf.service.data.*
import com.nsd.noa.schema.AttachmentPackages
import org.apache.cxf.helpers.IOUtils
import org.xml.sax.InputSource
import java.io.StringReader
import javax.activation.DataHandler
import javax.xml.xpath.XPathFactory
import javax.xml.parsers.DocumentBuilderFactory


fun DataHandler.toStringContent(): String {
    return IOUtils.toString(this.inputStream, "UTF-8")
}

fun AttachmentPackages.toEmailAttachments(): List<EmailAttachment> {

    return mutableListOf<EmailAttachment>().run {
        this@toEmailAttachments.attachmentPackage.forEach {
            println("ATTACHMENT")
            add(EmailAttachment(it.attachments.attachment.document.fileId, it.fileFormatCd, it.fileId))
        }
        this
    }
}

fun String.toEmailBody(): String {
    println("entered into email body " + this.length)
    val source = InputSource(StringReader(this))
    val document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(source)
    val xpath = XPathFactory.newInstance().newXPath()


    val prodInfo = ProducerInfo(
            name = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/Producer/GeneralPartyInfo/NameInfo/CommlName", document).trim(),
            addr1 = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/Producer/GeneralPartyInfo/Addr/Addr1", document).trim(),
            addr2 = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/Producer/GeneralPartyInfo/Addr/Addr2", document).trim(),
            city = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/Producer/GeneralPartyInfo/Addr/City", document).trim(),
            state = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/Producer/GeneralPartyInfo/Addr/StateProvCd", document).trim(),
            agencyID = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/InsuredOrPrincipal/ItemIdInfo/AgencyId", document).trim(),
            email = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/Producer/GeneralPartyInfo/Communications/EmailInfo/EmailAddr", document).trim()
    )

    val insInfo = InsuredInfo(
            name = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/InsuredOrPrincipal/GeneralPartyInfo/NameInfo/CommlName/CommercialName", document).trim(),
            fein = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/InsuredOrPrincipal/GeneralPartyInfo/NameInfo//TaxIdTypeCd", document).trim(),
            addr1 = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/InsuredOrPrincipal/GeneralPartyInfo/Addr/Addr1", document).trim(),
            city = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/InsuredOrPrincipal/GeneralPartyInfo/Addr/City", document).trim(),
            state = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/InsuredOrPrincipal/GeneralPartyInfo/Addr/StateProvCd", document).trim(),
            sic = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/InsuredOrPrincipal/InsuredOrPrincipalInfo/BusinessInfo/SICCd", document).trim()
    )

    val umInfo = UmbrellaInfo(
            lobCD = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlUmbrellaLineBusiness/LOBSubCd", document).trim(),
            limit1 = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlUmbrellaLineBusiness/CommlCoverage/Limit[1]/FormatInteger", document).trim(),
            appliesTo1 = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlUmbrellaLineBusiness/CommlCoverage/Limit[1]/LimitAppliesToCd", document).trim(),
            limit2 = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlUmbrellaLineBusiness/CommlCoverage/Limit[2]/FormatInteger", document).trim(),
            appliesTo2 = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlUmbrellaLineBusiness/CommlCoverage/Limit[2]/LimitAppliesToCd", document).trim(),
            deductible = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlUmbrellaLineBusiness/CommlCoverage/Deductible/FormatInteger", document).trim(),
            firstDollarDef = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlUmbrellaLineBusiness/FirstDollarDefenseInd", document).trim()
    )

    return EmailData(
            producerInfo = prodInfo,
            umbrellaInfo = umInfo,
            insuredInfo = insInfo,
            policyEffDate = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlPolicy/ContractTerm/EffectiveDt", document).trim(),
            policyExpDate = xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/CommlPolicy/ContractTerm/ExpirationDt", document).trim()
    ).toString()


}

fun String.toEmailSubject(): String {
    println("entered into email body " + this.length)
    val source = InputSource(StringReader(this))
    val document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(source)
    val xpath = XPathFactory.newInstance().newXPath()
    return xpath.evaluate("/ACORD/InsuranceSvcRq/CommlPkgPolicyQuoteInqRq/InsuredOrPrincipal/GeneralPartyInfo/NameInfo/CommlName/CommercialName", document).trim()
}