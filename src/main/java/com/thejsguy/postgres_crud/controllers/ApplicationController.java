package com.thejsguy.postgres_crud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    private static final String ACTIVE = "ACTIVE";

    @GetMapping("/isActive")
    public String isActive() {
        return ACTIVE;
    }
}

