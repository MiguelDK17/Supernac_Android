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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hortifruti extends AppCompatActivity {
    TextView edtBatata,edtAlface,edtMamão,tvescondido,edtTotal;
    CardView crdBatata,crdAlface,crdMamão;
    String Total,TotalDefinitivo,quantidade_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hortifruti);
        edtBatata = (TextView) findViewById(R.id.edtBatata);
        edtAlface = (TextView) findViewById(R.id.edtAlface);
        edtMamão = (TextView) findViewById(R.id.edtMamão);

        edtTotal = (EditText) findViewById(R.id.edtTotalhortifruti);
        tvescondido = (EditText) findViewById(R.id.tvescondido4);
        crdBatata = (CardView) findViewById(R.id.crdBatata);
        crdAlface = (CardView) findViewById(R.id.crdAlface);
        crdMamão = (CardView) findViewById(R.id.crdMamão);

        crdBatata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double batata = 34.99;
                Double E = batata;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_do_hortifruti = new
                        AlertDialog.Builder(Hortifruti.this);
                dialogo_do_hortifruti.setTitle("CARRINHO");
                dialogo_do_hortifruti.setMessage(" Quanto deste item você quer ?   " +String.valueOf(batata));
                final EditText quantidade = new EditText(Hortifruti.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_do_hortifruti.setView(quantidade);
                dialogo_do_hortifruti.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtBatata.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent agua = new Intent(getApplicationContext(),finalizando_compras.class);
                        agua.putExtra("house",edtTotal.getText().toString());
                        startActivity(agua);

                        Toast.makeText(Hortifruti.this,"Foi Adicionado  "+quantidade_final+" Saco/s de Batata"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_do_hortifruti.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_do_hortifruti.setCancelable(false);
                dialogo_do_hortifruti.show();

            }
        });
        crdAlface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alface = 3.00;
                Double E = alface;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_do_hortifruti = new
                        AlertDialog.Builder(Hortifruti.this);
                dialogo_do_hortifruti.setTitle("CARRINHO");
                dialogo_do_hortifruti.setMessage(" Quanto deste item você quer ?   " +String.valueOf(alface));
                final EditText quantidade = new EditText(Hortifruti.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_do_hortifruti.setView(quantidade);
                dialogo_do_hortifruti.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtAlface.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent agua = new Intent(getApplicationContext(),finalizando_compras.class);
                        agua.putExtra("house",edtTotal.getText().toString());
                        startActivity(agua);

                        Toast.makeText(Hortifruti.this,"Foi Adicionado  "+quantidade_final+" Alface Crespa"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_do_hortifruti.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_do_hortifruti.setCancelable(false);
                dialogo_do_hortifruti.show();

            }
        });
        crdMamão.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mamao = 4.99;
                Double E = mamao;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_do_hortifruti = new
                        AlertDialog.Builder(Hortifruti.this);
                dialogo_do_hortifruti.setTitle("CARRINHO");
                dialogo_do_hortifruti.setMessage(" Quanto deste item você quer ?   " +String.valueOf(mamao));
                final EditText quantidade = new EditText(Hortifruti.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_do_hortifruti.setView(quantidade);
                dialogo_do_hortifruti.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtMamão.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent agua = new Intent(getApplicationContext(),finalizando_compras.class);
                        agua.putExtra("house",edtTotal.getText().toString());
                        startActivity(agua);

                        Toast.makeText(Hortifruti.this,"Foi Adicionado  "+quantidade_final+" Mamão"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_do_hortifruti.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_do_hortifruti.setCancelable(false);
                dialogo_do_hortifruti.show();

            }
        });
    }
}