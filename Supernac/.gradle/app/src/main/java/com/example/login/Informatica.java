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

public class Informatica extends AppCompatActivity {
    CardView crdIphone,crdMacBook,crdRoteador,crdCabo;
    TextView edtTotal,edtIphone,edtMacBook,edtRoteador,edtCabo;
    TextView tvescondido;
    String Total,TotalDefinitivo,quantidade_final;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatica);
        crdIphone = (CardView) findViewById(R.id.crdIphone);
        crdRoteador = (CardView) findViewById(R.id.crdRoteador);
        crdCabo = (CardView) findViewById(R.id.crdCabo);
        crdMacBook = (CardView) findViewById(R.id.crd_macbook);

        edtTotal = (EditText) findViewById(R.id.edtTotalinfo);
        edtIphone = (TextView) findViewById(R.id.edtIphone);
        edtMacBook = (TextView) findViewById(R.id.edtMacBook);
        edtRoteador = (TextView) findViewById(R.id.edtRoteador);
        edtCabo = (TextView) findViewById(R.id.edtCabo);

        tvescondido = (TextView) findViewById(R.id.tvescondido8);


        crdIphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double iphone = 4799;
                Double E = iphone;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_informatica = new
                        AlertDialog.Builder(Informatica.this);
                dialogo_da_informatica.setTitle("CARRINHO");
                dialogo_da_informatica.setMessage(" Quanto deste item você quer ?   " +String.valueOf(iphone));
                final EditText quantidade = new EditText(Informatica.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_informatica.setView(quantidade);
                dialogo_da_informatica.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtIphone.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent agua = new Intent(getApplicationContext(),finalizando_compras.class);
                        agua.putExtra("house",edtTotal.getText().toString());
                        startActivity(agua);

                        Toast.makeText(Informatica.this,"Foi Adicionado  "+quantidade_final+" Iphone"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_informatica.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_informatica.setCancelable(false);
                dialogo_da_informatica.show();
            }
        });
        crdMacBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double macbook = 7500;
                Double E = macbook;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_informatica = new
                        AlertDialog.Builder(Informatica.this);
                dialogo_da_informatica.setTitle("CARRINHO");
                dialogo_da_informatica.setMessage(" Quanto deste item você quer ?   " +String.valueOf(macbook));
                final EditText quantidade = new EditText(Informatica.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_informatica.setView(quantidade);
                dialogo_da_informatica.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtMacBook.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent coca = new Intent(getApplicationContext(),finalizando_compras.class);
                        coca.putExtra("house",edtTotal.getText().toString());
                        startActivity(coca);

                        Toast.makeText(Informatica.this,"Foi Adicionado  "+ quantidade_final +" MacBook"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_informatica.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_informatica.setCancelable(false);
                dialogo_da_informatica.show();
            }
        });
        crdRoteador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double roteador = 1799;
                Double E = roteador;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_informatica = new
                        AlertDialog.Builder(Informatica.this);
                dialogo_da_informatica.setTitle("CARRINHO");
                dialogo_da_informatica.setMessage(" Quanto deste item você quer ?   " +String.valueOf(roteador));
                final EditText quantidade = new EditText(Informatica.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_informatica.setView(quantidade);
                dialogo_da_informatica.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtRoteador.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(Informatica.this,"Foi Adicionado  "+ quantidade_final +" Roteador"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_informatica.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_informatica.setCancelable(false);
                dialogo_da_informatica.show();
            }
        });
        crdCabo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double usb = 15;
                Double E = usb;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_informatica = new
                        AlertDialog.Builder(Informatica.this);
                dialogo_da_informatica.setTitle("CARRINHO");
                dialogo_da_informatica.setMessage(" Quanto deste item você quer ?   " +String.valueOf(usb));
                final EditText quantidade = new EditText(Informatica.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_informatica.setView(quantidade);
                dialogo_da_informatica.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtCabo.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(Informatica.this,"Foi Adicionado  "+ quantidade_final +" Cabo/s USB"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_informatica.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_informatica.setCancelable(false);
                dialogo_da_informatica.show();
            }
        });
    }
}