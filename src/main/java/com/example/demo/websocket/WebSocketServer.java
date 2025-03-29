package com.example.demo.websocket;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;


public class WebSocketServer extends TextWebSocketHandler {

    public static List<WebSocketSession> sessions = new ArrayList<>();


    public static List<WebSocketSession> getSessions() {
        return sessions;
    }

    @OnOpen
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("Соединение установлено");
        sessions.add(session);
    }

    @OnClose
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("Соединение закрыто");
        sessions.remove(session);
    }
}


