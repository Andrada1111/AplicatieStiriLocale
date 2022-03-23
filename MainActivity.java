package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button Chat;
    Button Sport;
    Button BreakingNews;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chat = findViewById(R.id.button);
        Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Chat.class);
                startActivity(intent);
            }
        });

        Sport = findViewById(R.id.button1);
        Sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Sport.class);
                startActivity(intent);
            }
        });


        BreakingNews = findViewById(R.id.button2);
        BreakingNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, BreakingNews.class);
                startActivity(intent);
            }
        });
    }
}