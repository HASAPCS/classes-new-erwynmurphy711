package com.example;

public class Student {
    private int score;

    public Student(int score) {
        this.score = score;
        // TODO: Initialize the score
    }

    public String grade() {
        if(this.score >= 90){
            return "A";
        }
        else if(this.score >= 80){
            return "B";
        }
        else if(this.score >= 70){
            return "C";
        }
        else if(this.score >= 60){
            return "D";
        }
        else if(this.score < 60){
            return "F";
        }
        // TODO: Calculate and return the grade based on the score. 
        // Use the following grading scale:
        // 90-100: "A"
        // 80-89: "B"
        // 70-79: "C"
        // 60-69: "D"
        // Below 60: "F"
        return "";  // Change this default return statement
    }

    public boolean isPassing() {
        if(this.score >= 60){
            return true;
        }
        else{
            return false;
        }
        // TODO: Return true if the score is 60 or above, otherwise return false
    }
}
