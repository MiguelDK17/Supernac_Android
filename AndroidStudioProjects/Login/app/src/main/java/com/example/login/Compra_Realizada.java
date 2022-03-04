package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Compra_Realizada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_realizada);
        Button Sim = (Button) findViewById(R.id.btSim);
        Button Não = (Button) findViewById(R.id.btNão);

        Sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Compra_Realizada.this, categoria.class);
            }
        });
        Não.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Compra_Realizada.this,categoria.class);
            }
        });
    }
}