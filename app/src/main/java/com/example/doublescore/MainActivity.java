package com.example.doublescore;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private TextView scoreTextA, scoreTextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTextA = findViewById(R.id.team_a_score);
        scoreTextB = findViewById(R.id.team_b_score);

        Button buttonA3 = findViewById(R.id.button_a_3);
        Button buttonA2 = findViewById(R.id.button_a_2);
        Button buttonA1 = findViewById(R.id.button_a_1);

        Button buttonB3 = findViewById(R.id.button_b_3);
        Button buttonB2 = findViewById(R.id.button_b_2);
        Button buttonB1 = findViewById(R.id.button_b_1);

        Button buttonReset = findViewById(R.id.button_reset);

        buttonA3.setOnClickListener(v -> addPointsToTeamA(3));
        buttonA2.setOnClickListener(v -> addPointsToTeamA(2));
        buttonA1.setOnClickListener(v -> addPointsToTeamA(1));

        buttonB3.setOnClickListener(v -> addPointsToTeamB(3));
        buttonB2.setOnClickListener(v -> addPointsToTeamB(2));
        buttonB1.setOnClickListener(v -> addPointsToTeamB(1));

        buttonReset.setOnClickListener(v -> resetScores());
    }
    private void addPointsToTeamA(int points) {
        scoreTeamA += points;
        updateScores();
    }
    private void addPointsToTeamB(int points) {
        scoreTeamB += points;
        updateScores();
    }
    private void updateScores() {
        scoreTextA.setText(String.valueOf(scoreTeamA));
        scoreTextB.setText(String.valueOf(scoreTeamB));
    }
    private void resetScores() {
        scoreTeamA = 0;
        scoreTeamB = 0;
        updateScores();
    }
}
