package com.philipe.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
	
	


	public ValidationError(Integer status, String msg, Long timestamp, String path, String error) {
		super(status, msg, timestamp, path, error);
	}

	private static final long serialVersionUID = 1L;

	
	private List<FieldMessage> erros = new ArrayList<>(); 
	


	public List<FieldMessage> getErrors() {
		return erros;
	}

	public void addError(String fieldName, String message) {
		erros.add(new FieldMessage(fieldName,message));
	}
	
	

	
}
