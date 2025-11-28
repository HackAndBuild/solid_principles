package com.example.solid_principles.openAndCloseprinciple.goodEample;

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
