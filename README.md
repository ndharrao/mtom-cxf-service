# mtom-cxf-service
It uses the following frameworks and is written in Kotlin.

1. Apache CXF for service
2. Spring Boot for app deployment
3. XSD based contract for services
4. JAVA Mail APIs for Mailing Client


The service end point takes XML request and sends XML response back. The processing is all around receiving attachments from the client and generating email and attach same files which were received through request XML.

I used Apache TCP Mon (https://ws.apache.org/tcpmon/) to monitor if the content over the wire uses XOP or not. Apache has discontinued TCP Mon but still a good basic tool to understand the traffic details. You may use Fiddler or Wireshark as well.  
