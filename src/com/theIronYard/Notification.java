package com.theIronYard;

import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;

    protected String status = "feets";



    public Notification(String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
    }

    public String getSubject() {

        return subject;
    }

    public String getBody() {

        return body;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    protected void stringStatus(){
        System.out.println(status);
    }

    protected void thisIsMyMethod() {
        System.out.println("This is some text");
    }

    public void transport() throws NoTransportException {

    }

}

