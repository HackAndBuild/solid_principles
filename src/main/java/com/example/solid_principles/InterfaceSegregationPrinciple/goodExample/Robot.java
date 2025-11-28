package com.example.solid_principles.InterfaceSegregationPrinciple.goodExample;

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot assembles components");
    }
}
