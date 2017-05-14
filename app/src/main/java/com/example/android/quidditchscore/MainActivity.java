package com.example.android.quidditchscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_SCORE_TEAM_A = "valueOfScoreTeamA";
    private static final String STATE_SCORE_TEAM_B = "valueOfScoreTeamB";
    private static final String STATE_SCORE_FOULS_A = "valueOfScoreFoulsA";
    private static final String STATE_SCORE_FOULS_B = "valueOfAcoreFoulsB";
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreFoulsTeamA = 0;
    int scoreFoulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putInt(STATE_SCORE_TEAM_A, scoreTeamA);
        saveInstanceState.putInt(STATE_SCORE_TEAM_B, scoreTeamB);
        saveInstanceState.putInt(STATE_SCORE_FOULS_A, scoreFoulsTeamA);
        saveInstanceState.putInt(STATE_SCORE_FOULS_B, scoreFoulsTeamB);

    }

    public void onRestoreInstanceState(Bundle saveInstanceState) {

        scoreTeamA = saveInstanceState.getInt(STATE_SCORE_TEAM_A);
        scoreTeamB = saveInstanceState.getInt(STATE_SCORE_TEAM_B);
        scoreFoulsTeamA = saveInstanceState.getInt(STATE_SCORE_FOULS_A);
        scoreFoulsTeamB = saveInstanceState.getInt(STATE_SCORE_FOULS_B);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamA(scoreFoulsTeamA);
        displayFoulsForTeamB(scoreFoulsTeamB);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls score for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given fouls score for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 10 points.
     */

    public void addTenForTeamA(View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 150 points.
     */

    public void addOneHundredFiftyForTeamA(View view) {
        scoreTeamA = scoreTeamA + 150;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score Fouls for Team A by 1 point.
     */

    public void addOneFoulForTeamA(View view) {
        scoreFoulsTeamA = scoreFoulsTeamA + 1;
        displayFoulsForTeamA(scoreFoulsTeamA);
    }


    /**
     * Code for Team B
     * *************************************************************
     */


    /**
     * Increase the score for Team B by 10 point.
     */

    public void addTenForTeamB(View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 150 points.
     */

    public void addOneHundredFiftyForTeamB(View view) {
        scoreTeamB = scoreTeamB + 150;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score fouls for Team B by 1 point..
     */

    public void addOneFoulForTeamB(View view) {
        scoreFoulsTeamB = scoreFoulsTeamB + 1;
        displayFoulsForTeamB(scoreFoulsTeamB);
    }

    public void resetCounters(View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreFoulsTeamA = 0;
        scoreFoulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamA(scoreFoulsTeamA);
        displayFoulsForTeamB(scoreFoulsTeamB);


    }


}
