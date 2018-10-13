
package com.nsd.noa.schema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nsd.noa.schema package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nsd.noa.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostRq }
     * 
     */
    public PostRq createPostRq() {
        return new PostRq();
    }

    /**
     * Create an instance of {@link Sender }
     * 
     */
    public Sender createSender() {
        return new Sender();
    }

    /**
     * Create an instance of {@link Receiver }
     * 
     */
    public Receiver createReceiver() {
        return new Receiver();
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link MsgItem }
     * 
     */
    public MsgItem createMsgItem() {
        return new MsgItem();
    }

    /**
     * Create an instance of {@link PostRq.WorkFolder }
     * 
     */
    public PostRq.WorkFolder createPostRqWorkFolder() {
        return new PostRq.WorkFolder();
    }

    /**
     * Create an instance of {@link PostResponse }
     * 
     */
    public PostResponse createPostResponse() {
        return new PostResponse();
    }

    /**
     * Create an instance of {@link PostRs }
     * 
     */
    public PostRs createPostRs() {
        return new PostRs();
    }

    /**
     * Create an instance of {@link MsgFile }
     * 
     */
    public MsgFile createMsgFile() {
        return new MsgFile();
    }

    /**
     * Create an instance of {@link Owner }
     * 
     */
    public Owner createOwner() {
        return new Owner();
    }

    /**
     * Create an instance of {@link FileSize }
     * 
     */
    public FileSize createFileSize() {
        return new FileSize();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Attachments }
     * 
     */
    public Attachments createAttachments() {
        return new Attachments();
    }

    /**
     * Create an instance of {@link AttachmentPackage }
     * 
     */
    public AttachmentPackage createAttachmentPackage() {
        return new AttachmentPackage();
    }

    /**
     * Create an instance of {@link AttachmentPackages }
     * 
     */
    public AttachmentPackages createAttachmentPackages() {
        return new AttachmentPackages();
    }

    /**
     * Create an instance of {@link MsgStatus }
     * 
     */
    public MsgStatus createMsgStatus() {
        return new MsgStatus();
    }

}
