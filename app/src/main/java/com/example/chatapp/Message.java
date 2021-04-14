package com.example.chatapp;

public class Message {
    private String author;
    private String textOfMessage;
    private long date;
    private String imageUlr;

    public Message(String author, String textOfMessage, long date, String imageUlr) {
        this.author = author;
        this.textOfMessage = textOfMessage;
        this.date = date;
        this.imageUlr = imageUlr;
    }

    public Message () {
    }

    public String getImageUlr() {
        return imageUlr;
    }

    public void setImageUlr(String imageUlr) {
        this.imageUlr = imageUlr;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTextOfMessage() {
        return textOfMessage;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setTextOfMessage(String textOfMessage) {
        this.textOfMessage = textOfMessage;
    }


}
