package com.example.week11;

public class Team extends SoccerEntity {
    private String name;
    private String country;
    private String league;

    public Team(String name, String country, String league) {
        this.name = name;
        this.country = country;
        this.league = league;
    }

    @Override
    public String getName() {
        return name;
    }


}
