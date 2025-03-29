package com.example.demo.Controllers.Rest;

import com.example.demo.model.entities.BookDates;
import com.example.demo.model.repositories.BookDatesRepository;
import com.example.demo.websocket.WebSocketServer;
import lombok.SneakyThrows;
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

    @SneakyThrows
    @GetMapping("/esp")
    public void esp(@RequestParam String uid) {
        for (WebSocketSession session1 : sessions) {
            session1.sendMessage(new TextMessage(uid));
        }
    }
}