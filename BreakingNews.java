package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BreakingNews extends AppCompatActivity {

    ImageButton Iohannis;
    ImageButton Avarii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breaking_news);

        Iohannis = findViewById(R.id.imageButton);
        Iohannis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(BreakingNews.this, Iohannis.class);
                startActivity(intent);
            }
        });

        Avarii = findViewById(R.id.imageButton1);
        Avarii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(BreakingNews.this, Avarii.class);
                startActivity(intent);
            }
        });
    }
}