package com.ash.journal.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/ashwani")
public class control {

    @GetMapping("/hello")
    public String hello() {
        return "1+2";
    }
}

