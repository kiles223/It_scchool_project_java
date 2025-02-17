package com.example.demo;

import com.example.demo.websocket.WebSocketConfig;
import com.example.demo.websocket.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    int i = 0;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    @GetMapping("/bum")
    public String bumbumbam(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "xindex";
    }

    @GetMapping("/esp")
    public String esp(@RequestParam(name = "uid", required = false, defaultValue = "Error") String name, Model model) {
        model.addAttribute("uid", name);
        return "esp";
    }
}