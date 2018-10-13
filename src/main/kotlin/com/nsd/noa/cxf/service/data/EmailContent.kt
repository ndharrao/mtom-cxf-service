package com.nsd.noa.cxf.service.data

import javax.activation.DataHandler

data class EmailContent(val sendTo : String, val subject: String, val body : String, val attachments : List<EmailAttachment>)

data class EmailAttachment(val fileName : String, val mimeType:  String, val content : DataHandler)

const val tabs = "\t\t\t"

data class EmailData (
        val producerInfo : ProducerInfo,
        val insuredInfo : InsuredInfo,
        val policyEffDate : String,
        val policyExpDate : String,
        val umbrellaInfo : UmbrellaInfo
) {
    override fun toString(): String {
        return "$producerInfo\n\n" +
                "$insuredInfo\n\n" +
                "Policy Effective Date : \t $policyEffDate\n" +
                "Policy Expiry Date : \t $policyExpDate\n\n" +
                "$umbrellaInfo"

    }
}

class UmbrellaInfo(val lobCD :String,
                   val limit1 : String,
                   val appliesTo1 : String,
                   val limit2 : String,
                   val appliesTo2 : String,
                   val deductible : String,
                   val firstDollarDef : String) {
    override fun toString(): String {
        return "Umbrella\n" +
                "LOB Cd: ${tabs(2)} $lobCD\n" +
                "Limit: $tabs $limit1\n" +
                "Applies To: ${tabs(2)} $appliesTo1\n" +
                "Limit: $tabs $limit2\n" +
                "Applies To: ${tabs(2)} $appliesTo2\n" +
                "First Dollar Def: \t $firstDollarDef"
    }
}

class InsuredInfo(val name: String,
                  val fein : String,
                  val addr1 : String,
                  val city: String,
                  val state: String,
                  val sic : String) {
    override fun toString(): String {
        return "Insured Info\n" +
                "Name: $tabs $name\n" +
                "FEIN: $tabs $fein\n" +
                "Address1: ${tabs(2)}$addr1\n" +
                "City: $tabs $city\n" +
                "State: $tabs $state\n" +
                "SIC: $tabs $sic"
    }
}

data class ProducerInfo(val name : String,
                        val addr1 : String,
                        val addr2 : String,
                        val city : String,
                        val state : String,
                        val agencyID : String,
                        val email :String) {
    override fun toString(): String {
        return "Producer Name: \t $name\n" +
                "Address1: ${tabs(2)} $addr1\n" +
                "Address2: ${tabs(2)} $addr2\n" +
                "City: ${tabs(3)} $city\n" +
                "State: ${tabs(3)} $state \n" +
                "Agency ID: ${tabs(2)} $agencyID\n" +
                "EMAIL: ${tabs(3)} $email"
    }

}

private fun tabs(nos : Int=1) : String = "\t".repeat(nos)