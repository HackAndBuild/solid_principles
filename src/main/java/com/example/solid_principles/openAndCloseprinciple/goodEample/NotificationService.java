package com.example.solid_principles.openAndCloseprinciple.goodEample;

class NotificationService {
    public void notify(Notification notification, String message) {
        notification.send(message);
    }
}
