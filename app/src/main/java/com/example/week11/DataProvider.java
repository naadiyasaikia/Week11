package com.example.week11;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<Team> getSampleTeams() {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("FC Barcelona", "Spain", "La Liga"));
        teams.add(new Team("PSG", "France", "Ligue 1"));
        return teams;
    }

    public static List<Player> getSamplePlayers() {
        List<Player> players = new ArrayList<>();
        // Now only 3 parameters (name, position, team)
        players.add(new Player("Lionel Messi", "Forward", "FC Barcelona"));
        players.add(new Player("Kylian Mbappé", "Forward", "PSG"));
        return players;
    }
}
