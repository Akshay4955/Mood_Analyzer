package com.bridgelabz;

public class MoodAnalyzer {
    String mood;

    public MoodAnalyzer(String message) {
        if (message.contains("Sad")) {
            this.mood = "SAD";
        }
        else
            this.mood = "HAPPY";
    }
    public String analyzeMood() {
        return this.mood;
    }
}
