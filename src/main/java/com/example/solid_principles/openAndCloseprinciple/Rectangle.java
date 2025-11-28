package com.example.solid_principles.openAndCloseprinciple;

import lombok.Data;

@Data
class Rectangle implements Shape {
    private double width, height;

    public double calculateArea() {
        return width * height;
    }
}
