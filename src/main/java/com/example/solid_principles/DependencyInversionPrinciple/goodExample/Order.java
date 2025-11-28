package com.example.solid_principles.DependencyInversionPrinciple.goodExample;

import javax.management.Notification;

public class Order {
    public static void main(String[] args) {
        NotificationService notificationService=new EmailNotification();
        OrderService orderService=new OrderService(notificationService);
    }
}
