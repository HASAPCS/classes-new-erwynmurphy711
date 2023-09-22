package com.example;

public class Car {
    private int speed;

    public Car() {
        this.speed = 0;
        // TODO: Initialize the speed to 0
    }

    public void speedUp(int increment) {
        this.speed = this.speed + increment;
        // TODO: Increase the speed by the value of the increment parameter
    }

    public void slowDown(int decrement) {
        this.speed = this.speed - decrement;
        // TODO: Decrease the speed by the value of the decrement parameter. 
        // The speed should not be negative.
    }

    public int currentSpeed() {
        // TODO: Return the current speed
        return speed;  // Change this default return statement
    }
}
