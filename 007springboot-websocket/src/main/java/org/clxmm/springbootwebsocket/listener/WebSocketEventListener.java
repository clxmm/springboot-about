package org.clxmm.springbootwebsocket.listener;

import org.clxmm.springbootwebsocket.model.ChatMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

/**
 * @author clx
 * @date 2020/8/13 13:34
 */
@Component
public class WebSocketEventListener {


    private final static Logger LOGGER = LoggerFactory.getLogger(WebSocketEventListener.class);

    @Autowired
    private SimpMessageSendingOperations messageTemplate;


    @EventListener
    public void handleWebSocketConnectListener(SessionDisconnectEvent event) {
        LOGGER.info("Received a new web socket connection");
    }


    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
        String username = (String) headerAccessor.getSessionAttributes().get("username");

        if (!StringUtils.isEmpty(username)) {
            LOGGER.info("user disconnect :" + username);
            ChatMessage message = new ChatMessage();
            message.setType(ChatMessage.MessageType.LEAVE);
            message.setSender(username);
            messageTemplate.convertAndSend("/topic/public", message);
        }

    }


}
