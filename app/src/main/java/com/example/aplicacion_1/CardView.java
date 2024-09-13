package com.example.aplicacion_1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CardView extends AppCompatActivity {
    RecyclerView tv1;
    String [] nombres = {"josefa","carla"};
    int [] edades = {24, 17};
    int [] fotos = {R.drawable.jade,R.drawable.polo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        tv1 = findViewById(R.id.tv1);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        tv1.setLayoutManager(linearLayoutManager);

        tv1.setAdapter(new AdapatorPersona());

        setContentView(R.layout.activity_card_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private class AdapatorPersona extends RecyclerView.Adapter<AdapatorPersona.AdapatadorPersonaHolder> {
        @NonNull
        @Override
        public AdapatadorPersonaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AdapatadorPersonaHolder(getLayoutInflater().inflate(R.layout.card_view_activity, parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull AdapatadorPersonaHolder holder, int position) {
        holder.imprimir(position);

        }

        @Override
        public int getItemCount() {
            return nombres.length;
        }

        class AdapatadorPersonaHolder extends RecyclerView.ViewHolder{

            ImageView iv1;
            TextView txtNombre, txtEdad;
            public AdapatadorPersonaHolder(@NonNull View itemView) {
                super(itemView);

                iv1= itemView.findViewById(R.id.imageView);
                txtNombre = itemView.findViewById(R.id.txtNombre);
                txtEdad = itemView.findViewById(R.id.txtEdad);
            }

            public void imprimir(int position) {
                iv1.setImageResource(fotos[position]);
                txtNombre.setText(nombres[position]);
                txtEdad.setText("Edades:"+edades[position]);
            }
        }
    }
}