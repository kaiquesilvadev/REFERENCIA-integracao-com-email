package com.kaique.integrations.domain.dto;

public class EmailDto {

	private String fromEmail;
	private String fromName;
	private String replyto;
	private String to;
	private String Subject;
	private String body;
	private String contentType;

	public EmailDto() {
	}

	public EmailDto(String fromEmail, String fromName, String replyto, String to, String subject, String body,
			String contentType) {
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.replyto = replyto;
		this.to = to;
		Subject = subject;
		this.body = body;
		this.contentType = contentType;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getReplyto() {
		return replyto;
	}

	public void setReplyto(String replyto) {
		this.replyto = replyto;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
}
