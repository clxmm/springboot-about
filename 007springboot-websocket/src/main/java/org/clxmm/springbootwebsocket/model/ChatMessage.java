package org.clxmm.springbootwebsocket.model;


/**
 * @author clx
 * @date 2020/8/13 11:21
 */
public class ChatMessage {
    private MessageType type;

    /**
     * 消息内容
     */
    private String content;


    /**
     * 消息内容
     */
    private String sender;

    public enum MessageType {
        CHAT, // 消息
        JOIN,  // 加入
        LEAVE // 离开
    }


    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
