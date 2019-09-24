package com.philipe.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
	private Integer status;
	private String message;
	private String path;
	private String error;
	
	
	public StandardError(Integer status, String msg, Long timestamp, String path, String error) {
		super();
		this.status = status;
		this.message = msg;
		this.timestamp = timestamp;
		this.path = path;
		this.setError(error);
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMsg() {
		return message;
	}


	public void setMsg(String msg) {
		this.message = msg;
	}


	public Long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}
	
	
}
