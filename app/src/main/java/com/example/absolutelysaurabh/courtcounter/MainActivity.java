package com.example.absolutelysaurabh.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int scoreA=0;
    public static int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void A_plus_two(View view){

        scoreA+=2;
        A_display(scoreA);
    }
    public void A_plus_three(View view){

        scoreA+=3;
        A_display(scoreA);
    }
    public void A_free_throw(View view){

        scoreA+=1;
        A_display(scoreA);
    }

    public void B_free_throw(View view){

        scoreB+=1;
        B_display(scoreB);
    }

    public void B_plus_two(View view){

        scoreB+=2;
        B_display(scoreB);
    }
    public void B_plus_three(View view){

        scoreB+=3;
        B_display(scoreB);
    }

    public void A_display(int number){
        TextView text_score = (TextView) findViewById(R.id.A_score_text);
        text_score.setText(""+number);

    }

    public void B_display(int number){
        TextView text_score = (TextView) findViewById(R.id.B_score_text);
        text_score.setText(""+number);

    }

    public void reset(View view){

        scoreA=0;
        scoreB=0;
        A_display(scoreA);
        B_display(scoreB);
    }
}
