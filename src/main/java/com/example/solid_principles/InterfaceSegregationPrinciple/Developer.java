package com.example.solid_principles.InterfaceSegregationPrinciple;

class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer writes code");
    }

    @Override
    public void eat() {
        System.out.println("Developer eats in canteen");
    }
}
