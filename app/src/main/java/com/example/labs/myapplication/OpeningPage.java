package com.example.labs.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OpeningPage extends AppCompatActivity {

    private ImageButton anxious, sad, tired, happy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_page);

        anxious = (ImageButton) findViewById(R.id.imageButton5);
        sad = (ImageButton) findViewById(R.id.imageButton8);
        tired = (ImageButton) findViewById(R.id.imageButton7);
        happy = (ImageButton) findViewById(R.id.imageButton9);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }


    public void openActivity2() {

        Intent intent = new Intent(this, activity_lpp2901_2.class);
        startActivity(intent);
    }
}
