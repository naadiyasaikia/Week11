package com.example.week11;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {
    private List<Team> teams;


    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView teamName, teamCountry, teamLeague; // Added league

        public TeamViewHolder(View itemView) {
            super(itemView);
            teamName = itemView.findViewById(R.id.teamName);
            teamCountry = itemView.findViewById(R.id.teamCountry);
            teamLeague = itemView.findViewById(R.id.teamLeague); // Initialize
        }
    }

    // Step 3.2: Constructor
    public TeamAdapter(List<Team> teams) {
        this.teams = teams;
    }

    // Step 3.3: Required methods
    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.teamName.setText(team.getName());
        holder.teamCountry.setText(team.getCountry());
        holder.teamLeague.setText(team.getLeague()); // Bind league data
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}