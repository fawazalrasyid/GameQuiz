package com.fawazalrasyid.gamequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView Bindonesia, Binggris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // card
        Bindonesia = (CardView) findViewById(R.id.bindonesia_card);
        Binggris = (CardView) findViewById(R.id.binggris_card);

        //clickl istener
        Bindonesia.setOnClickListener(this);
        Binggris.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.bindonesia_card:
                i = new Intent(this, BindonesiaActivity.class);startActivity(i);break;
            default:break;
        }

        switch (view.getId()) {
            case R.id.binggris_card:
                i = new Intent(this, BinggrisActivity.class);startActivity(i);break;
            default:break;
        }

    }
}
