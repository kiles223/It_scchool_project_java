package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    @GetMapping("/bum")
    public String bumbumbam() {
        return "index";
    }

    @GetMapping("/esp")
    public String esp(@RequestParam(name = "uid", required = false, defaultValue = "Error") String name, Model model) {
        model.addAttribute("uid", name);
        return "ESP";
    }

}