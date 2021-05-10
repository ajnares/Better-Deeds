package com.example.better_deeds;

import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class GameplayProper extends AppCompatActivity {

    ImageView imgSelectedCharacter, imgSituation;
    Button btnYes,btnNo;
    TextView txtSituation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay_proper);
        try
        {
           imgSituation = findViewById(R.id.imgSituation);
           imgSelectedCharacter = findViewById(R.id.imgSelectedCharacter);
           btnYes = findViewById(R.id.btnYes);
           btnNo = findViewById(R.id.btnNo);
           txtSituation = findViewById(R.id.txtSituation);

            btnYes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent correctAnswer = new Intent(GameplayProper.this,GameExplaination.class);
                    startActivity(correctAnswer);
                    Animatoo.animateFade(GameplayProper.this);
                    finish();
                }
            });
            btnNo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent wrongAnswer = new Intent(GameplayProper.this,GameExplaination.class);
                    startActivity(wrongAnswer);
                    Animatoo.animateFade(GameplayProper.this);
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