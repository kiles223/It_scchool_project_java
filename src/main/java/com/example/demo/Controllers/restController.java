package com.example.demo.Controllers;

import com.example.demo.websocket.WebSocketServer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.List;

@RestController
public class restController {

    List<WebSocketSession> sessions = WebSocketServer.getSessions();

    @GetMapping("/esp")
    public void esp(@RequestParam(name = "uid", required = false, defaultValue = "Error") String name, Model model) {
        model.addAttribute("uid", name);
        for (WebSocketSession session1 : sessions) {
            try {
                session1.sendMessage(new TextMessage(name));
            } catch (Exception e) {
                System.out.println("Ошибка при отправке сообщения");
            }
        }
    }
}
