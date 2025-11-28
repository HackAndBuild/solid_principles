package com.example.solid_principles.openAndCloseprinciple.goodEample;

class WhatsAppNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp: " + message);
    }
}
