package com.kaique.integrations.api.ExceptionHandler;

import java.time.OffsetDateTime;

public class ApiErro {

	private OffsetDateTime timesTamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public ApiErro() {
	}

	public OffsetDateTime getTimesTamp() {
		return timesTamp;
	}

	public void setTimesTamp(OffsetDateTime timesTamp) {
		this.timesTamp = timesTamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
