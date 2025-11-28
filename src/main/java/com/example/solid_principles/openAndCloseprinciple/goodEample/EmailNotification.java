package com.example.solid_principles.openAndCloseprinciple.goodEample;

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
