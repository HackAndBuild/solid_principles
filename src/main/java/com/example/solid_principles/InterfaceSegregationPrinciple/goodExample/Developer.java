package com.example.solid_principles.InterfaceSegregationPrinciple.goodExample;

class Developer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Developer writes code");
    }

    @Override
    public void eat() {
        System.out.println("Developer eats in canteen");
    }
}
