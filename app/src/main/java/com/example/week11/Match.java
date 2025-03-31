package com.example.week11;

public abstract class Match implements SoccerEntity {
    private String homeTeam;
    private String awayTeam;
    private String score;

    @Override
    public String getName() {
        return homeTeam + " vs " + awayTeam;
    }
    @Override
    public void displayDetails() {
        System.out.println("Match: " + homeTeam + " vs " + awayTeam + " - Score: " + score);
    }


}
