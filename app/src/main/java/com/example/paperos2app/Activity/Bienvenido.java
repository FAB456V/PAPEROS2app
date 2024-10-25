package com.example.paperos2app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.paperos2app.R;

public class Bienvenido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.bienvenido);

        Button ordena = findViewById(R.id.btn_ordena);

        ordena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambia el nombre del método a onClick (en minúscula)
                Intent intent = new Intent(Bienvenido.this, Mindentificate.class);
                startActivity(intent);
            }
        });


    }
}