package com.example.part2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class About extends AppCompatActivity {

    public CardView mathCard;
    public CardView englishCard;

    public void init() {
        mathCard = (CardView) findViewById(R.id.mathCard);

        mathCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent mathIntent = new Intent(About.this, MathCardActivity.class);
                startActivity(mathIntent);
            }
        });

        englishCard = findViewById(R.id.englishCard);

        englishCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent englishIntent = new Intent(About.this, MathCardActivity.class);
                startActivity(englishIntent);
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
