package com.example.demo.Controllers.mainController;

import com.example.demo.model.dto.BookDatesDto;
import com.example.demo.model.dto.HouseDto;
import com.example.demo.model.entities.BookDates;
import com.example.demo.services.interfaces.BookDatesService;
import com.example.demo.services.interfaces.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.max;

@Controller
public class MainController {
    private final BookDatesService bookDatesService;
    private final HouseService houseService;
    private final LocalContainerEntityManagerFactoryBean entityManagerFactory;

    @Autowired
    public MainController(HouseService houseService,BookDatesService bookDatesService, LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        this.houseService = houseService;
        this.bookDatesService = bookDatesService;
        this.entityManagerFactory = entityManagerFactory;
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
        List<BookDatesDto> bookDatesDtos = bookDatesService.getAllBookDates();
        List<Long> idList = new ArrayList<>();
        for (BookDatesDto bookDatesDto : bookDatesDtos) {
            idList.add(bookDatesDto.getId());
        }
        model.addAttribute("lastId", Collections.max(idList));;
        System.out.println(Collections.max(idList));
        return "../static/html/testPattern.html";
    }
    @GetMapping("/dialogTest")
    public String dialogTest(@RequestParam(name = "id") String uid, Model model) {
        Long houseId = Long.parseLong(uid);
        HouseDto houseDto = houseService.getHouseById(houseId);
        model.addAttribute("house", houseDto);
        return "pupupu";
    }

}