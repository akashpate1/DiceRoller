package com.akashpate.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton blueDice;
    private ImageButton redDice;
    private Random randomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueDice = findViewById(R.id.blueDiceBtn);
        redDice = findViewById(R.id.redDiceBtn);

        ImageButton rollDiceBtn = findViewById(R.id.rollDiceBtn);
        rollDiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollBlueDice();
                rollRedDice();
            }
        });

        blueDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollBlueDice();
            }
        });

        redDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollRedDice();
            }
        });
    }

    private void rollBlueDice(){
        int blueDiceNumber = randomNumber.nextInt(6) + 1;
        switch (blueDiceNumber){
            case 1:
                blueDice.setBackgroundResource(R.drawable.dice_1);
                break;
            case 2:
                blueDice.setBackgroundResource(R.drawable.dice_2);
                break;
            case 3:
                blueDice.setBackgroundResource(R.drawable.dice_3);
                break;
            case 4:
                blueDice.setBackgroundResource(R.drawable.dice_4);
                break;
            case 5:
                blueDice.setBackgroundResource(R.drawable.dice_5);
                break;
            case 6:
                blueDice.setBackgroundResource(R.drawable.dice_6);
                break;
        }

    }
    private void rollRedDice(){
        int redDiceNumber = randomNumber.nextInt(6) + 1;
        switch (redDiceNumber){
            case 1:
                redDice.setBackgroundResource(R.drawable.dice_red_1);
                break;
            case 2:
                redDice.setBackgroundResource(R.drawable.dice_red_2);
                break;
            case 3:
                redDice.setBackgroundResource(R.drawable.dice_red_3);
                break;
            case 4:
                redDice.setBackgroundResource(R.drawable.dice_red_4);
                break;
            case 5:
                redDice.setBackgroundResource(R.drawable.dice_red_5);
                break;
            case 6:
                redDice.setBackgroundResource(R.drawable.dice_red_6);
                break;
        }
    }
}
