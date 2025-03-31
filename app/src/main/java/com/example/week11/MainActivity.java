package com.example.week11;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Repository<Team> teamRepo = new Repository<>();
        List<Team> teams = DataProvider.getSampleTeams();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        TeamAdapter adapter = new TeamAdapter(teams);
        recyclerView.setAdapter(adapter);

        teamRepo.add(new Team("FC Barcelona", "Spain", "La Liga"));
        teamRepo.add(new Team("PSG", "France", "Ligue 1"));

        List<Team> spanishTeams = teamRepo.filter(team -> team.getCountry().equals("Spain"));

        for (Team team : spanishTeams) {
            team.displayDetails();

        Repository<Player> playerRepo = new Repository<>();
        playerRepo.addAll(DataProvider.getSamplePlayers());
        List<Player> forwards = playerRepo.filter(p -> p.getPosition().equals("Forward"));
        for (Player p : forwards) {
            p.displayDetails();
        }
    }
}