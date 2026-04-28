package com.demo.java8;

class Children {
    private String name;
    private int score;

    public Children(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() { return score; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name; // Returns name for clean output
    }
}