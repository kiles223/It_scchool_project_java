package com.example.demo.Controllers;

import com.example.demo.model.entities.BookDates;
import com.example.demo.model.repositories.BookDatesRepository;
import com.example.demo.services.HouseService;
import com.example.demo.websocket.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.List;

@RestController
public class restController {
    private final BookDatesRepository bookDatesRepository;
    public restController (BookDatesRepository bookDatesRepository) {
        this.bookDatesRepository = bookDatesRepository;
    }
    List<WebSocketSession> sessions = WebSocketServer.getSessions();

    @GetMapping("/esp")
    public void esp(@RequestParam String uid) {
        for (WebSocketSession session1 : sessions) {
            try {
                session1.sendMessage(new TextMessage(uid));
            } catch (Exception e) {
                System.out.println("Ошибка при отправке сообщения");
            }
        }
    }

    @GetMapping("/dates")
    public void dates(@RequestParam String dateOne, @RequestParam String dateTwo, @RequestParam String houseId) {
        BookDates newDate = new BookDates();
        newDate.setBookedDateStart(dateOne);
        newDate.setBookedDateEnd(dateTwo);
        newDate.setHouseId(Long.parseLong(houseId));
        bookDatesRepository.save(newDate);
    }
}