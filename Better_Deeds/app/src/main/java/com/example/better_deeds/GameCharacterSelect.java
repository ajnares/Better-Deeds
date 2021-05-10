package com.example.better_deeds;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class GameCharacterSelect extends AppCompatActivity {

    ImageButton btnCharacONE, btnCharacTWO, btnCharacTHREE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_character_select);

        btnCharacONE = findViewById(R.id.imgChar_ONE);
        btnCharacTWO = findViewById(R.id.imgChar_TWO);
        btnCharacTHREE = findViewById(R.id.imgChar_THREE);

        try
        {
            btnCharacONE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent characterIntroduction = new Intent(GameCharacterSelect.this,GameSplashGreetings.class);
                    startActivity(characterIntroduction);
                    Animatoo.animateFade(GameCharacterSelect.this);
                    finish();
                }
            });
            btnCharacTWO.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent characterIntroduction = new Intent(GameCharacterSelect.this,GameSplashGreetings.class);
                    startActivity(characterIntroduction);
                    Animatoo.animateFade(GameCharacterSelect.this);
                    finish();
                }
            });
            btnCharacTHREE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent characterIntroduction = new Intent(GameCharacterSelect.this,GameSplashGreetings.class);
                    startActivity(characterIntroduction);
                    Animatoo.animateFade(GameCharacterSelect.this);
                    finish();
                }
            });
        }
        catch (Exception e)
        {
            Log.e("Error","Something is wrong. Try Again");
        }


    }
}