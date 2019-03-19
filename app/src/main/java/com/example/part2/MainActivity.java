package com.example.part2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    public Button map;
    public Button about;
    public Button contact;

    public void init() {
        map = findViewById(R.id.mapButton);

        map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mapIntent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(mapIntent);
            }
        });

        about = findViewById(R.id.aboutButton);

        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent aboutIntent = new Intent(MainActivity.this, About.class);
                startActivity(aboutIntent);
            }
        });

        contact = findViewById(R.id.contactButton);

        contact.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent contactIntent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(contactIntent);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
