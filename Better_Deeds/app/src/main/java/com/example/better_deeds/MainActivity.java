package com.example.better_deeds;

import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        try{
            int SPLASH = 3000;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent gameActivity = new Intent(MainActivity.this,GameMainMenu.class);
                    startActivity(gameActivity);
                    Animatoo.animateInAndOut(MainActivity.this);

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