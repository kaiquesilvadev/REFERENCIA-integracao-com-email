package com.kaique.integrations.api.ExceptionHandler;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kaique.integrations.domain.exceptions.EmailException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ApiErroHandler {

	@ExceptionHandler(EmailException.class)
	public ResponseEntity<?> TrataEmailException(EmailException ex , HttpServletRequest request) {
		
		ApiErro erro = new ApiErro();
		erro.setTimesTamp(OffsetDateTime.now());
		erro.setPath(request.getRequestURI());
		erro.setStatus(HttpStatus.BAD_REQUEST.value());
		erro.setError("Email erro");
		erro.setMessage(ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(erro);
	}
}
