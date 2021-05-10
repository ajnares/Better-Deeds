package com.example.better_deeds;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class GameExplaination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_explaination);

        Button btnContinue,btnQuit;
        btnContinue = findViewById(R.id.btnContinue);
        btnQuit = findViewById(R.id.btnQuit);

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //POP_UP THAT SAYS SOMETHING LIKE THANK YOU FOR PLAYING CHUCHU
                finish();
            }
        });
    }
}