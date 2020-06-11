package br.com.departamento.control;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.departamento.config.dto.LoginRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api")
@Slf4j
public class ApplicationControl {
	
	@PostMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> postLogin(@Valid @RequestBody LoginRequest login) {
		log.info("Login input: {}", login);
		return null;
	}

}
