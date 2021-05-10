package com.example.better_deeds;

import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class GameSplashGreetings extends AppCompatActivity {

    ImageView imgCharacterGreet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_splash_greetings);

        try
        {
            imgCharacterGreet = findViewById(R.id.imgView_Character);
            imgCharacterGreet.setImageResource(R.drawable.invincible);
            int SPLASH = 1000;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent gameplay = new Intent(GameSplashGreetings.this,GameplayProper.class);
                    startActivity(gameplay);
                    Animatoo.animateInAndOut(GameSplashGreetings.this);
                    finish();
                }
            }, SPLASH);
        }
        catch (Exception e)
        {
            Log.e("Error","Something is wrong. Try Again");
        }

    }
}