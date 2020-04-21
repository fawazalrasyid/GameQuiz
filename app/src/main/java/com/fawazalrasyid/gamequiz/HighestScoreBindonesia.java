package com.fawazalrasyid.gamequiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HighestScoreBindonesia extends AppCompatActivity {
    private Button mainbtn, trybtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score_bindonesia);

        mainbtn =  (Button) findViewById(R.id.mainbtn);
        mainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        trybtn = (Button) findViewById(R.id.trybtn);
        trybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBindonesiaActivity();
            }
        });

        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Score Anda: " + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("Score Tertinggi: "+highscore);
        else
        {
            txtHighScore.setText("Score Tertinggi: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openBindonesiaActivity() {
        Intent intent = new Intent(this, BindonesiaActivity.class);
        startActivity(intent);
    }
}