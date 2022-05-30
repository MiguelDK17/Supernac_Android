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

public class bebidas extends AppCompatActivity {

    CardView crdAgua,crdCoca,crdKapo;
    TextView edtAgua,edtCoca,edtKapo,edtTotal;
    TextView tvescondido;
    String TotalDefinitivo,quantidade_final,Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        crdAgua = (CardView) findViewById(R.id.crdAgua);
        crdCoca = (CardView) findViewById(R.id.crdCocaCola);
        crdKapo = (CardView) findViewById(R.id.crdDellValle);
        edtAgua = (TextView) findViewById(R.id.edtAgua);
        edtCoca = (TextView) findViewById(R.id.edtCoca);
        edtKapo = (TextView) findViewById(R.id.edtKapo);
        edtTotal = (EditText) findViewById(R.id.edtTotalBebidas);
        tvescondido = (TextView) findViewById(R.id.tvescondido2);

        crdAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double agua = 2.99;
                Double E = agua;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(agua));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtAgua.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent agua = new Intent(getApplicationContext(),finalizando_compras.class);
                        agua.putExtra("house",edtTotal.getText().toString());
                        startActivity(agua);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+quantidade_final+" Água"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdCoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double coca = 7.99;
                Double E = coca;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(coca));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtCoca.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent coca = new Intent(getApplicationContext(),finalizando_compras.class);
                        coca.putExtra("house",edtTotal.getText().toString());
                        startActivity(coca);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Coca Cola"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdKapo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kapo = 6.99;
                Double E = kapo;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(kapo));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtKapo.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Dell Valle Kapo"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
    }
}