package com.example.aplicacion_1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class checkBoxsActivity extends AppCompatActivity {

    private EditText pnlCalculadora, pnlCalculadora2;
    private TextView coo;
    private CheckBox cbxSumar, cbxRestar, cbxDividir, cbxMultiplicar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_check_boxs);

        pnlCalculadora = findViewById(R.id.pnlCalculadora);
        pnlCalculadora2 = findViewById(R.id.pnlCalculadora2);
        cbxSumar = findViewById(R.id.cbxSumar);
        cbxRestar = findViewById(R.id.cbxRestar);
        cbxDividir = findViewById(R.id.cbxDividir);
        cbxMultiplicar = findViewById(R.id.cbxMultiplicar);
        coo = findViewById(R.id.coo);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void btnCalcular(View v) {
        int v1 = Integer.parseInt(pnlCalculadora.getText().toString());
        int v2 = Integer.parseInt(pnlCalculadora2.getText().toString());
        String resu = "";
        if (cbxSumar.isChecked()) {
            int suma = v1 + v2;
            resu +=  suma + "";
        }
        if (cbxRestar.isChecked()) {
            int resta = v1 - v2;
            resu +=":"+  resta + "";
        }
        if (cbxDividir.isChecked()) {
            int divide = v1 / v2;
            resu += ":"+divide + "";
        }
        if (cbxMultiplicar.isChecked()) {
            int multi = v1 * v2;
            resu += ""+multi + "";
        }
        coo.setText(resu);
    }


}