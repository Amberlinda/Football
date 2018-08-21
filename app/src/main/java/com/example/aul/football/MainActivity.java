package com.example.aul.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0,scoreTeamB = 0;
    int foulTeamA = 0, foulTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display_teamA_score(int score)
    {
        TextView scoreview = (TextView)findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }
    public void display_teamB_score(int score)
    {
        TextView scoreview = (TextView)findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }
    public void display_teamA_foul(int score)
    {
        TextView scoreview = (TextView)findViewById(R.id.team_a_foul);
        scoreview.setText(String.valueOf(score));
    }
    public void display_teamB_foul(int score)
    {
        TextView scoreview = (TextView)findViewById(R.id.team_b_foul);
        scoreview.setText(String.valueOf(score));
    }

    public void scoreteama(View view){

        scoreTeamA = scoreTeamA + 1;
        display_teamA_score(scoreTeamA);
    }
    public void scoreteamb(View view){
        scoreTeamB = scoreTeamB + 1;
        display_teamB_score(scoreTeamB);
    }
    //function for team a foul plus
    public void foul_team_a(View view){
        foulTeamA = foulTeamA + 1;
        display_teamA_foul(foulTeamA);
    }
    //function for team a foul plus
    public void foul_team_b(View view){
        foulTeamB = foulTeamB + 1;
        display_teamB_foul(foulTeamB);
    }
    //function for team a foul minus
    public void foul_team_a_(View view){

        foulTeamA = foulTeamA - 1;
        display_teamA_foul(foulTeamA);
    }
    //function for team b foul minus
    public void foul_team_b_(View view){
        foulTeamB = foulTeamB - 1;
        display_teamB_foul(foulTeamB);
    }
    //function for team A score minus
    public void scoreteam_a_(View view){

        scoreTeamA = scoreTeamA - 1;
        display_teamA_score(scoreTeamA);
    }
    //function for team B score minus
    public void scoreteam_b_(View view){

        scoreTeamB = scoreTeamB - 1;
        display_teamB_score(scoreTeamB);
    }
    public void reset(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        display_teamA_score(scoreTeamA);
        display_teamB_score(scoreTeamB);
        display_teamA_foul(foulTeamA);
        display_teamB_foul(foulTeamB);
    }
}
