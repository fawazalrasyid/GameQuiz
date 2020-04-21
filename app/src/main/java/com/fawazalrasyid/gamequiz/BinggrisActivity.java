package com.fawazalrasyid.gamequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BinggrisActivity extends AppCompatActivity {

    private QuestionBankBinggris mQuestionLibrary = new QuestionBankBinggris();
    //
    private TextView mScoreView = (TextView)findViewById(R.id.score);   // Untuk menampilkan skor saat ini
    private TextView mQuestionView;  //menampilkan jawaban
    private Button mButtonChoice1; // jawaban 1
    private Button mButtonChoice2; // jawaban 2
    private Button mButtonChoice3; //jawaban 3
    private Button mButtonChoice4; //jawaban 4

    private String mAnswer;  // untuk cek jawaban benar atau tidaknya
    private int mScore = 0;  // total score
    private int mQuestionNumber = 0; //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binggris);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        updateQuestion();

        updateScore(mScore);
    }

    private void updateQuestion(){
        //
        if(mQuestionNumber<mQuestionLibrary.getLength() ){


            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber,4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else {
            Toast.makeText(BinggrisActivity.this, "Ini Adalah Pertanyaan Terakhir", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(BinggrisActivity.this, HighestScoreBinggris.class);
            intent.putExtra("score", mScore);
            startActivity(intent);
        }
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore+"/"+mQuestionLibrary.getLength());
    }

    public void onClick(View view) {

        Button answer = (Button) view;

        if (answer.getText() == mAnswer){
            mScore = mScore + 1;
            Toast.makeText(BinggrisActivity.this, "Jawaban Benar!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(BinggrisActivity.this, "Jawaban Salah!", Toast.LENGTH_SHORT).show();

        updateScore(mScore);
        updateQuestion();
    }
}
