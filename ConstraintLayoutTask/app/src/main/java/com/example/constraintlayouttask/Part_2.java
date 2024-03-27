package com.example.constraintlayouttask;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Part_2 extends AppCompatActivity {
    //created an initial setup to allow for new pages consisting of each part of this constraint layout assignment
    Button btn_Pg3;
    Button btn_Pg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part2);



        // Initialize btn_pg2 with the button ID from layout
        btn_Pg3 = findViewById(R.id.btn_Pg3);
        btn_Pg1 = findViewById(R.id.btn_Pg1);

        btn_Pg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen3(v);
            }
        });
        btn_Pg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen1(v);
            }
        });
    }

    // Method to navigate to a new screen
    public void screen1(View view) {
        Intent intent = new Intent(this, Part_1.class);
        startActivity(intent);
    }
    public void screen3(View view) {
        Intent intent = new Intent(this, Part_3.class);
        startActivity(intent);
    }
}