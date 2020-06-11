package br.com.departamento.controller;


import br.com.departamento.dto.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/api")
@Slf4j
public class DepartamentoVLanController {


    @PostMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> postLogin(@Valid @RequestBody LoginRequest login) {
        log.info("Login input: {}", login);
        return null;
    }

}
