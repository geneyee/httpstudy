package com.study.httpstudy.controller;

import com.study.httpstudy.dto.Message;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public HttpEntity request(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Message message = new Message("success");

        return new ResponseEntity<>(message, headers, HttpStatus.OK);
    }

}
