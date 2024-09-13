package com.example.aplicacion_1;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
        private EditText nombre, contrasenha;
        private Button btnConfirmar, btnSalir;



        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            nombre = findViewById(R.id.panel);
            contrasenha = findViewById(R.id.panel2);
            btnConfirmar = findViewById(R.id.btnConfirmar);
            btnSalir = findViewById(R.id.btnSalir);

            btnSalir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String nombreUsuario = nombre.getText().toString();
                    String contrasenhaUsuario = contrasenha.getText().toString();

                if (nombreUsuario.equals("...") && contrasenhaUsuario.equals("...")){
                    Intent intent = new Intent(MainActivity.this, tableLayoutActivity.class);
                    startActivity(intent);
                }

                }
            });

            btnConfirmar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    Intent intent = new Intent(MainActivity.this, tableLayoutActivity.class);
                    startActivity(intent);
                }
            });

        }



}
