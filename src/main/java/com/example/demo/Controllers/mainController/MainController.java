package com.example.demo.Controllers.mainController;

import com.example.demo.model.dto.HouseDto;
import com.example.demo.services.interfaces.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private final HouseService houseService;
    @Autowired
    public MainController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/pattern")
    public String pattern(@RequestParam(name = "id") String uid, Model model) {
        Long houseId = Long.parseLong(uid);
        HouseDto houseDto = houseService.getHouseById(houseId);
        model.addAttribute("house", houseDto);
        return "../static/html/testPattern.html";
    }
}