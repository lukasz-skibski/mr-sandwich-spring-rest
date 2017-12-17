package com.mundanemeatballs.demo.mrsandwich.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserRestController
 */
@RestController
public class UserRestController {
    @RequestMapping(value = "/user")
    public ResponseEntity<String> getInfo() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}