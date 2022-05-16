package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Jogos extends AppCompatActivity {
    CardView crdPS4,crdPS4MEGA,crdPS4SPIDER;
    TextView edtPS4,edtPS4MEGA,edtPS4SPIDER,edtTotal;
    TextView tvescondido;
    String Total,TotalDefinitivo,quantidade_final;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho_jogos);

        crdPS4 = (CardView) findViewById(R.id.crdPS4);
        crdPS4MEGA = (CardView) findViewById(R.id.crdPS4MEGAPACK);
        crdPS4SPIDER = (CardView) findViewById(R.id.crdPS4SPIDERMAN);

        edtPS4 = (TextView) findViewById(R.id.edtPS4);
        edtPS4MEGA = (TextView) findViewById(R.id.edtPS4MEGAPACK);
        edtPS4SPIDER = (TextView) findViewById(R.id.edtPS4SPIDERMAN);
        edtTotal = (EditText) findViewById(R.id.edtTotaljogos);

        tvescondido = (TextView) findViewById(R.id.tvescondido7);

        crdPS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double PS4 = 2399;
                Double E = PS4;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(PS4));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPS4.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent assolan = new Intent(getApplicationContext(),finalizando_compras.class);
                        assolan.putExtra("house",edtTotal.getText().toString());
                        startActivity(assolan);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" PS4 SLIM"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });


        crdPS4MEGA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double PS4MEGA = 2999;
                Double E = PS4MEGA;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos= new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(PS4MEGA));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPS4MEGA.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" PS4 MEGA PACK"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdPS4SPIDER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double PS4SPIDER = 2499;
                Double E = PS4SPIDER;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(PS4SPIDER));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPS4SPIDER.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" PS4 SPIDER-MAN"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });

    }
}