package com.kaique.integrations.api.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kaique.integrations.domain.dto.EmailDto;
import com.kaique.integrations.domain.services.EmailService;

@RestController
@RequestMapping("/emails")
public class EmailControlle {

	@Autowired
	private EmailService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void sendEmail(@RequestBody EmailDto dto) {
		service.sendEmail(dto);
	}

}
