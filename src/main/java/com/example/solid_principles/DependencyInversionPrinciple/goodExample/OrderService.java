package com.example.solid_principles.DependencyInversionPrinciple.goodExample;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    private NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        notificationService.notify("order placed successfully...");
    }
}
