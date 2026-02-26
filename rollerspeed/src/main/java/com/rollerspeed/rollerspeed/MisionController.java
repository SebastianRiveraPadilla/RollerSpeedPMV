package com.rollerspeed.rollerspeed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MisionController {

    @GetMapping("/mision")
    public String inicio() {
        return "mision.html";
    }
}
