package com.example.constraintlayouttask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

public class Part_5 extends AppCompatActivity {
//created an initial setup to allow for new pages consisting of each part of this constraint layout assignment
    private ConstraintLayout layout;
    private Placeholder placeholder;


    Button btn_Pg4;
    Button btn_Pg5_1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part5);

        layout = findViewById(R.id.Layout);

        placeholder = findViewById(R.id.placeholder);



        // Initialize btn_pg2 with the button ID from layout
        btn_Pg4 = findViewById(R.id.btn_Pg4);
        btn_Pg5_1 = findViewById(R.id.btn_Pg5_1);
        btn_Pg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen1(v);
            }
        });

        btn_Pg5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen2(v);
            }
        });
    }

    public void swapView(View v) {
        TransitionManager.beginDelayedTransition(layout);
        placeholder.setContentId(v.getId());
    }

    // Method to navigate to a new screen
    public void screen1(View view) {
        Intent intent = new Intent(this, Part_4.class);
        startActivity(intent);
    }
    public void screen2(View view) {
        Intent intent = new Intent(this, Part_5_1.class);
        startActivity(intent);
    }



}