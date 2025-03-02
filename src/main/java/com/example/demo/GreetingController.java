package com.example.demo;

import com.example.demo.model.House;
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
    @GetMapping("/")
    public String bumbumbam(Model model) {
        House test = new House("дом №13 «тестовый» ","1300.00","поздравляю");
        model.addAttribute("house", test);

        return "index";
    }

    @GetMapping("/esp")
    public String esp(@RequestParam(name = "uid", required = false, defaultValue = "Error") String name, Model model) {
        model.addAttribute("uid", name);
        return "ESP";
    }

}