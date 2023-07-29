package com.example.pruebapueblofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class restaurantes extends AppCompatActivity {
        Button boton;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_restaurantes);

            boton= findViewById(R.id.botonvermasrestaurantes);

            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(restaurantes.this, ListaRestaurantes.class);
                    startActivity(intent);
                }
            });
        }


    }

