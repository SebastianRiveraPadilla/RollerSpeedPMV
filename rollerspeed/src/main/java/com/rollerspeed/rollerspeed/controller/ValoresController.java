package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValoresController {

    @GetMapping("/valores")
    public String inicio() {
        return "valores.html";
    }
}
