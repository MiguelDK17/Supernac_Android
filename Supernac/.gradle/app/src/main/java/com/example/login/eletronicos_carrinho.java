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

public class eletronicos_carrinho extends AppCompatActivity {
    CardView crdMultimetro,crdCapacitor,crdChuveiro;
    TextView edtMultimetro,edtCapacitor,edtChuveiro;
    TextView tvescondido,edtTotal;
    String TotalDefinitivo,quantidade_final;
    String Total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletronicos_carrinho);
        crdMultimetro = (CardView) findViewById(R.id.crdMultimetro);
        crdCapacitor = (CardView) findViewById(R.id.crdCapacitor);
        crdChuveiro = (CardView) findViewById(R.id.crdChuveiro);

        edtMultimetro = (TextView) findViewById(R.id.edtMultimetro);
        edtCapacitor = (TextView) findViewById(R.id.edtCapacitor);
        edtChuveiro = (TextView) findViewById(R.id.edtChuveiro);
        edtTotal = (TextView) findViewById(R.id.edtTotaleletronicos);
        tvescondido = (TextView) findViewById(R.id.tvescondido6);

        crdMultimetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multimetro = 37.97;
                Double E = multimetro;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_eletronicos = new
                        AlertDialog.Builder(eletronicos_carrinho.this);
                dialogo_dos_eletronicos.setTitle("CARRINHO");
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(multimetro));
                final EditText quantidade = new EditText(eletronicos_carrinho.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_eletronicos.setView(quantidade);
                dialogo_dos_eletronicos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtMultimetro.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent assolan = new Intent(getApplicationContext(),finalizando_compras.class);
                        assolan.putExtra("house",edtTotal.getText().toString());
                        startActivity(assolan);

                        Toast.makeText(eletronicos_carrinho.this,"Foi Adicionado  "+quantidade_final+" Multímetro/s"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_eletronicos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_eletronicos.setCancelable(false);
                dialogo_dos_eletronicos.show();
            }
        });


        crdCapacitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double capacitor = 0.20;
                Double E = capacitor;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_eletronicos= new
                        AlertDialog.Builder(eletronicos_carrinho.this);
                dialogo_dos_eletronicos.setTitle("CARRINHO");
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(capacitor));
                final EditText quantidade = new EditText(eletronicos_carrinho.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_eletronicos.setView(quantidade);
                dialogo_dos_eletronicos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtCapacitor.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(eletronicos_carrinho.this,"Foi Adicionado  "+quantidade_final+" Capacitor/s"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_eletronicos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_eletronicos.setCancelable(false);
                dialogo_dos_eletronicos.show();
            }
        });
        crdChuveiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double chuveiro = 59.99;
                Double E = chuveiro;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_eletronicos = new
                        AlertDialog.Builder(eletronicos_carrinho.this);
                dialogo_dos_eletronicos.setTitle("CARRINHO");
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(chuveiro));
                final EditText quantidade = new EditText(eletronicos_carrinho.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_eletronicos.setView(quantidade);
                dialogo_dos_eletronicos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtChuveiro.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(eletronicos_carrinho.this,"Foi Adicionado  "+quantidade_final+" Ducha Lorenzetti/s"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_eletronicos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_eletronicos.setCancelable(false);
                dialogo_dos_eletronicos.show();
            }
        });
    }
}