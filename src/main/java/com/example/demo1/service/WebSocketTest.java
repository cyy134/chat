package com.example.demo1.service;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/webSocket/{userName}")
public class WebSocketTest {

    private Session session;
    private static int onlineCount = 0;
    private static CopyOnWriteArraySet<WebSocketTest> webSocketTests = new CopyOnWriteArraySet<>();

    @OnOpen
    public void onOpen(){}

    @OnClose
    public void onClose(){}

    @OnMessage
    public void onMessage(String message, Session session){}

    
}
