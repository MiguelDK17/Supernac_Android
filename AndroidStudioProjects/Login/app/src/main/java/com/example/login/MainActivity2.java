package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2);
        EditText tvRecebeusu;
        FloatingActionButton btcarrinhoflutuante;

        Button btOfertas = (Button) findViewById(R.id.btOfertas);
        tvRecebeusu = (EditText) findViewById(R.id.tvRecebeUsuario1);
        btcarrinhoflutuante = (FloatingActionButton)  findViewById(R.id.btcarrinhoflutuante);
        String usuario = getIntent().getStringExtra("blueberry");
        tvRecebeusu.setText("Olá "+usuario+" !!!");
        btOfertas.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Button  ButtonOfertas = (Button) findViewById(R.id.btOfertas);
                Button  ButtonNotificações = (Button) findViewById(R.id.btNotificações);
                Button  ButtonCanaisdecontato = (Button) findViewById(R.id.btCanaisdecontato);
                Button  VendasOnline = (Button) findViewById(R.id.vendas_online);

                VendasOnline.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent jude = new Intent(getApplicationContext(),Vendas_Online.class);
                        startActivity(jude);
                    }
                });

                btOfertas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent it = new Intent(getApplicationContext(),categoria.class);
                        startActivity(it);
                    }
                });
                btcarrinhoflutuante.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Intent be = new Intent(getApplicationContext(),finalizando_compras.class);
                       startActivity(be);
                    }
                });





            }
        });

    }
}