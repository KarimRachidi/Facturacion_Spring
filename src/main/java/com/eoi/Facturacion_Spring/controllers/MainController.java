package com.eoi.Facturacion_Spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = {"/"})
    public String showHome() {
        return "home";
    }

}
