package com.bridgelabz;

public class MoodAnalyzer {
    String mood;

    public MoodAnalyzer(String message) {
        try {
            if (message.contains("Sad")) {
                this.mood = "SAD";
            } else
                this.mood = "HAPPY";
        }catch (NullPointerException e) {
            this.mood = "HAPPY";
        }
    }
    public String analyzeMood() {
        return this.mood;
    }
}
