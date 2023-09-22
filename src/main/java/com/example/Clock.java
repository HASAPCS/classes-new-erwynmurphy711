package com.example;

public class Clock {
    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        // TODO: Initialize the hours and minutes
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
        if(this.minutes >= 60){
            this.minutes = this.minutes - 60;
            this.hours += 1;
        }
        }
        

    public String getTime() {
        String stringvalue = " ";
        if(this.hours >= 12){
            this.hours = this.hours - 12;
            if(this.hours >= 10){
                return this.hours+":"+this.minutes;
            }
            stringvalue = Integer.toString(this.hours);
            stringvalue = "0"+stringvalue;
            return stringvalue+":"+this.minutes;
        }

        // TODO: Return the time in the format "HH:MM"
        return this.hours + ":" + this.minutes; // Change this default return statement
    }
}
