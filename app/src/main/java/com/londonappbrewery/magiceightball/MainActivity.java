package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView BallDisplay= findViewById(R.id.imagemain);
        final int [] ballId={R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        Button mybutton;
        mybutton=findViewById(R.id.AskButton);
                mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rgn=new Random();
                int number=rgn.nextInt(5);
                BallDisplay.setImageResource(ballId[number]);
            }
        });
    }
}
