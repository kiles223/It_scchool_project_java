package com.example.demo.Controllers;

import com.example.demo.model.House;
import com.example.demo.websocket.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.List;
@Repository
@Controller
public class GreetingController {


    @GetMapping("/")
    public String index(Model model) {
        House test = new House("дом №13 «тестовый» ","1300.00","поздравляю");
        model.addAttribute("house", test);
        return "index";
    }


    @GetMapping("/pattern")
    public String pattern(@RequestParam(name = "house") String house, Model model) {
        House test = new House("дом №13 «тестовый» ","1300.00",house);
        model.addAttribute("house", test);
        return "../static/html/pattern.html";

    }

}