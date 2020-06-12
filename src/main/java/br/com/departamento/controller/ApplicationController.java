package br.com.departamento.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.departamento.dto.LoginRequest;
import br.com.departamento.service.AuthenticationService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/api")
@Slf4j
public class ApplicationController {
	
	private AuthenticationService authenticationService;
	
	@Autowired
	public ApplicationController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}


    @PostMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void postLogin(@Valid @RequestBody LoginRequest login) {
        log.info("Login input: {}", login);
        authenticationService.authenticate(login.getIdentifier(), login.getPassword());
    }

}
