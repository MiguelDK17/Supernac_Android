package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {
    Button btFacebook,btTwitter, btPerfil, btVendas, btOfertas, VendasOnline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2);
        EditText tvRecebeusu;
        FloatingActionButton btcarrinhoflutuante;


        tvRecebeusu = (EditText) findViewById(R.id.tvRecebeUsuario1);
        String usuario = getIntent().getStringExtra("blueberry");
        tvRecebeusu.setText("Olá " + usuario + " !!!");

        btVendas = (Button) findViewById(R.id.btVendas);
        btOfertas = (Button) findViewById(R.id.btOfertas);
        VendasOnline = (Button) findViewById(R.id.vendas_online);
        btFacebook = (Button) findViewById(R.id.btFacebook);
        btPerfil = (Button) findViewById(R.id.btPerfil);
        btTwitter = (Button) findViewById(R.id.btTwitter);


        btVendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity2.this, categoria.class);
                startActivity(it);
            }
        });
                btFacebook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent feeling = new Intent(getApplicationContext(),Facebook.class);
                        startActivity(feeling);
                    }
                });
                btPerfil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Back = new Intent(getApplicationContext(),Perfil.class);
                        startActivity(Back);
                    }
                });
                VendasOnline.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent jude = new Intent(getApplicationContext(),Vendas_Online.class);
                        startActivity(jude);
                    }
                });
                btTwitter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Road = new Intent(getApplicationContext(),Twitter.class);
                        startActivity(Road);
                    }
                });
            }
    }
