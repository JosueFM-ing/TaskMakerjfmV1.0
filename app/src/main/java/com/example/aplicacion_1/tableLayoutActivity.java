package com.example.aplicacion_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.aplicacion_1.databinding.CardViewActivityBinding;

public class tableLayoutActivity extends AppCompatActivity {

        private Button btnCalculadora;
        private Button btnCardView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_table_layout);

        btnCalculadora = findViewById(R.id.btnCalculadora);
        btnCardView = findViewById(R.id.btnCardView);

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tableLayoutActivity.this, checkBoxsActivity.class);
                startActivity(intent);
            }
        });

        btnCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tableLayoutActivity.this, CardView.class);
                startActivity(intent);
            }
        });



        





    }
}