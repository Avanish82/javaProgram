package com.spring.entity;

public class EmailEntity {
	
	 
    private String recipient;
    private String ccList;
    private String bccList;
    private String msgBody;
    private String subject;
    private String attachment;
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getCcList() {
		return ccList;
	}
	public void setCcList(String ccList) {
		this.ccList = ccList;
	}
	public String getBccList() {
		return bccList;
	}
	public void setBccList(String bccList) {
		this.bccList = bccList;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

}
