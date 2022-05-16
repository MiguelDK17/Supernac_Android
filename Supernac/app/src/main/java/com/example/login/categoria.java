package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class categoria extends AppCompatActivity {
    Button btfinalizar;
    CardView Jogos,Informatica,Eletronicos,Alimentos,Casa,Bebidas,Hortifruti,Padaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        Jogos = (CardView) findViewById(R.id.crdJogos);
        Eletronicos = (CardView) findViewById(R.id.crdEletronicos);
        Alimentos = (CardView) findViewById(R.id.crdAlimentos);
        Informatica = (CardView) findViewById(R.id.crd_informatica);
        Casa = (CardView) findViewById(R.id.crdCasa);
        Bebidas = (CardView) findViewById(R.id.crdBebidas);
        Hortifruti = (CardView) findViewById(R.id.crdHortifruti);
        Padaria = (CardView) findViewById(R.id.crdPadaria);
        btfinalizar = (Button) findViewById(R.id.btvoltarcarrinho);
        Jogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Jogos.class);
                startActivity(it);
            }
        });
        Eletronicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nova = new Intent(getApplicationContext(),eletronicos_carrinho.class);
                startActivity(nova);
            }
        });
        Alimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lib = new Intent(getApplicationContext(),alimentos.class);
                startActivity(lib);
            }
        });
        Informatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(getApplicationContext(),Informatica.class);
                startActivity(info);
            }
        });
        Casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent house = new Intent(getApplicationContext(), casa.class);
                startActivity(house);
            }
        });
        Bebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drink = new Intent(getApplicationContext(),bebidas.class);
                startActivity(drink);
            }
        });
        Hortifruti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fruit = new Intent(getApplicationContext(),Hortifruti.class);
                startActivity(fruit);
            }
        });
        Padaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cupcake = new Intent(getApplicationContext(),Padaria.class);
                startActivity(cupcake);
            }
        });
        btfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent carrinho = new Intent(getApplicationContext(),finalizando_compras.class);
                startActivity(carrinho);
            }
        });
    }

}