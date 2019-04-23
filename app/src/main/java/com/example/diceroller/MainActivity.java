package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public ImageView imageViewDicy;
    public ImageView imageViewDicyj;
    public Random myRandomNumber = new Random();
    public Random myRandomNumberj = new Random();
Button Bu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy = findViewById(R.id.imageView2);
        imageViewDicyj = findViewById(R.id.imageView3);

//        imageViewDicy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                rollOurDice();
//            }
//        });
//    }
        Bu = findViewById(R.id.button4);
        Bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollOurDice();
            }
        });
    }
    public void rollOurDice(){
        int myrn = myRandomNumber.nextInt(6) + 1;
        int myrni = myRandomNumberj.nextInt(6) + 1;
        switch (myrn){
            case 1:
                imageViewDicy.setImageResource(R.drawable.dice1);
                break;

            case 2:
                imageViewDicy.setImageResource(R.drawable.dice2);
                break;

            case 3:
                imageViewDicy.setImageResource(R.drawable.dice3);
                break;

            case 4:
                imageViewDicy.setImageResource(R.drawable.dice4);
                break;

            case 5:
                imageViewDicy.setImageResource(R.drawable.dice5);
                break;

            case 6:
                imageViewDicy.setImageResource(R.drawable.dice6);
                break;
        }

        switch (myrni){
            case 1:
                imageViewDicyj.setImageResource(R.drawable.dice1);
                break;

            case 2:
                imageViewDicyj.setImageResource(R.drawable.dice2);
                break;

            case 3:
                imageViewDicyj.setImageResource(R.drawable.dice3);
                break;

            case 4:
                imageViewDicyj.setImageResource(R.drawable.dice4);
                break;

            case 5:
                imageViewDicyj.setImageResource(R.drawable.dice5);
                break;

            case 6:
                imageViewDicyj.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
