package com.example.nexus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "RegisterActivity";

    CardView card0, card1, card2, card3, card4, card5;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        card0 = findViewById(R.id.main_card_0);
        card1 = findViewById(R.id.main_card_1);
        card2 = findViewById(R.id.main_card_2);
        card3 = findViewById(R.id.main_card_3);
        card4 = findViewById(R.id.main_card_4);
        card5 = findViewById(R.id.main_card_5);

        card0.setOnClickListener(this);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.main_card_0:
                Toast.makeText(MainActivity.this, "Card 0 Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.main_card_1:
                Toast.makeText(MainActivity.this, "Card 1 Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.main_card_2:
                Toast.makeText(MainActivity.this, "Card 2 Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.main_card_3:
                Toast.makeText(MainActivity.this, "Card 3 Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.main_card_4:
                Toast.makeText(MainActivity.this, "Card 4 Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.main_card_5:
                Toast.makeText(MainActivity.this, "Card 5 Clicked", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(MainActivity.this, "Default Switch Case", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}