package com.kh.day11.q9;

public class BaseballPlayer {
    private String name;
    private String position;
    private int numHits;
    private int numWalks;

    public BaseballPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getNumHits() {
        return numHits;
    }

    public int getNumWalks() {
        return numWalks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNumWalks(int numWalks) {
        this.numWalks = numWalks;
    }

    public void setNumHits(int numHits) {
        this.numHits = numHits;
    }
}
