package com.cospedia.helloservice.model;

public class Hello {
    private String message;
    private String user;


    public Hello(String message, String user) {
        this.message = message;
        this.user = user;
    }

    public Hello() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
