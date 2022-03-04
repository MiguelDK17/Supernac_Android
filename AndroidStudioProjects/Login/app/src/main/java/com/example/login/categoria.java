package com.example.login;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class categoria extends AppCompatActivity {
    Button  btJogos,btInformatica,btEletronicos,btAlimentos,btCasa,btBebidas,btHortifruti,btPadaria,
            btfinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        btJogos = (Button) findViewById(R.id.btJogos);
        btEletronicos = (Button) findViewById(R.id.btEletronica);
        btAlimentos = (Button) findViewById(R.id.btAlimentos);
        btInformatica = (Button) findViewById(R.id.btInformatica);
        btCasa = (Button) findViewById(R.id.btCasa);
        btBebidas = (Button) findViewById(R.id.btbebidas);
        btHortifruti = (Button) findViewById(R.id.btHortifruti);
        btPadaria = (Button) findViewById(R.id.btPadaria);
        btfinalizar = (Button) findViewById(R.id.btvoltarcarrinho);
        btJogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),CarrinhoJogosActivity.class);
                startActivity(it);
            }
        });
        btEletronicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nova = new Intent(getApplicationContext(),eletronicos_carrinho.class);
                startActivity(nova);
            }
        });
        btAlimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lib = new Intent(getApplicationContext(),alimentos.class);
                startActivity(lib);
            }
        });
        btInformatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(getApplicationContext(),Informatica.class);
                startActivity(info);
            }
        });
        btCasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent house = new Intent(getApplicationContext(), casa.class);
                startActivity(house);
            }
        });
        btBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drink = new Intent(getApplicationContext(),bebidas.class);
                startActivity(drink);
            }
        });
        btHortifruti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fruit = new Intent(getApplicationContext(),Hortifruti.class);
                startActivity(fruit);
            }
        });
        btPadaria.setOnClickListener(new View.OnClickListener() {
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