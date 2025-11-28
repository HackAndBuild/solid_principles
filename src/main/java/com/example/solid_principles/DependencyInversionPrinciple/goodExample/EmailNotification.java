package com.example.solid_principles.DependencyInversionPrinciple.goodExample;

public class EmailNotification implements NotificationService{
    @Override
    public void notify(String msg) {
        System.out.println("Sending Email: "+msg);
    }
}
