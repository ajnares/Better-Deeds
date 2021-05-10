package com.example.better_deeds;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class GameMainMenu extends AppCompatActivity {
    Button btnStartGame, btnOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_main_menu);

        try
        {
            btnStartGame = findViewById(R.id.btnStartGame);
            btnOptions = findViewById(R.id.btnOptions);

            btnStartGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent CharacterMenu = new Intent(GameMainMenu.this,GameCharacterSelect.class);
                    startActivity(CharacterMenu);
                    Animatoo.animateInAndOut(GameMainMenu.this);
                    finish();
                }
            });
            btnOptions.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent OptionMenu = new Intent(GameMainMenu.this,GameOptionsSelect.class);
                    startActivity(OptionMenu);
                    Animatoo.animateInAndOut(GameMainMenu.this);
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