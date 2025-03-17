package com.example.demo.Controllers;

import com.example.demo.model.dto.HouseDto;
import com.example.demo.model.entities.House;
import com.example.demo.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Repository
@Controller
public class GreetingController {
    private final HouseService houseService;
    @Autowired
    public GreetingController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }


    @GetMapping("/pattern")
    public String pattern(@RequestParam(name = "id") String uid, Model model) {
        Long houseId = Long.parseLong(uid);
        HouseDto houseDto = houseService.getHouseById(houseId);
        model.addAttribute("house", houseDto);
        return "../static/html/pattern.html";

    }

    @GetMapping("/test")
    public String test(Model model) {
        return "bootstrap-test";
    }

}