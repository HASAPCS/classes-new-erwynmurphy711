package com.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        // TODO: Initialize the length and width
    }

    public double area() {
        double areaa = 0;
        areaa = this.width*this.length;
        // TODO: Calculate and return the area of the rectangle
        return areaa;  // Change this default return statement
    }

    public double perimeter() {
        double perimeterr = 0;
        perimeterr = 2*this.length + 2*this.width;
        // TODO: Calculate and return the perimeter of the rectangle
        return perimeterr;  // Change this default return statement
    }
}
