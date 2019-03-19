package com.example.part2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class About extends AppCompatActivity {

    public CardView mathCard;
    public CardView englishCard;
    public CardView historyCard;
    public CardView scienceCard;

    public void init() {
        mathCard = findViewById(R.id.mathCard);

        mathCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent mathIntent = new Intent(About.this, MathCardActivity.class);
                startActivity(mathIntent);
            }
        });

        englishCard = findViewById(R.id.englishCard);

        englishCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent englishIntent = new Intent(About.this, EnglishCardActivity.class);
                startActivity(englishIntent);
            }
        });

        historyCard = findViewById(R.id.historyCard);

        historyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historyIntent = new Intent(About.this, HistoryCardActivity.class);
                startActivity(historyIntent);
            }
        });

        scienceCard = findViewById(R.id.scienceCard);

        scienceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scienceIntent = new Intent(About.this, ScienceCardActivity.class);
                startActivity(scienceIntent);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        init();
    }
}
