package com.mandarinblob;

/**
 * Created by Lisa on 2016-02-16.
 */
public class ScoreCounter {
    private static ScoreCounter ourInstance = new ScoreCounter();

    public static ScoreCounter getInstance() {
        return ourInstance;
    }

    private ScoreCounter() {
        score = 0;
    }

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incrementScore(int inc) {
        score += inc;
    }
}
