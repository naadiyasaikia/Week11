package com.example.week11;

public class Player implements SoccerEntity {
    private String name;
    private String position;
    private String team;

    public Player(String name, String position, String team) {
        this.name = name;
        this.position = position;
        this.team = team;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Player: " + name + " (" + position + ") - Team: " + team);
    }

    public String getPosition() {
        return position;
    }

}
