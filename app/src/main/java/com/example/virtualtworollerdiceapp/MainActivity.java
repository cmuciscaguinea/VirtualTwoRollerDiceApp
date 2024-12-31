package com.example.virtualtworollerdiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2;
    Random random = new Random();
    Button diceRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceRoll = (Button) findViewById(R.id.diceRoll);
        imageView1 = (ImageView) findViewById(R.id.view1);
        imageView2 = (ImageView) findViewById(R.id.view2);

        diceRoll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                diceRoll1();
                diceRoll2();

            }
        });
    }


    public void diceRoll1() {
        int randomNumber = random.nextInt(6) + 1;
        switch (randomNumber) {
            case 1:
                imageView1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.dice6);
                break;
            case 4:
                imageView1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView1.setImageResource(R.drawable.dice3);
                break;
        }

    }

    private void diceRoll2() {
        int randomNumber2 = random.nextInt(6) + 1;
        int rng;
        rng = 6;
        switch (randomNumber2) {
            case 1:
                imageView2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice6);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice4);
                break;

        }
    }
}