package com.example.solid_principles.openAndCloseprinciple;

class NotificationService {
    public void sendNotification(String message, String type) {
        if (type.equals("EMAIL")) {
            System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        } else if (type.equals("WHATSAPP")) {
            System.out.println("Sending WhatsApp: " + message);
        }
    }
}
