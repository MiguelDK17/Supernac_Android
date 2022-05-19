package com.example.login;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
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

public class casa extends AppCompatActivity {
    CardView crdAssolan,crdVeja,crdToalha,crdPano;
    TextView edtTotal,tvescondido,edtAssolan,edtPano,edtToalha,edtVeja;
    String Total,TotalDefinitivo;
    String quantidade_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa);



        crdAssolan = (CardView) findViewById(R.id.crdAssolan);
        crdPano = (CardView) findViewById(R.id.crdPano);
        crdToalha = (CardView) findViewById(R.id.crdToalha);
        crdVeja = (CardView) findViewById(R.id.crdVeja);
        edtAssolan = (TextView) findViewById(R.id.edtAssolan);
        edtPano = (TextView) findViewById(R.id.edtPano);
        edtToalha = (TextView) findViewById(R.id.edtToalha);
        edtVeja = (TextView) findViewById(R.id.edtVeja);
        /*btTotal = (Button) findViewById(R.id.btCalcularcasa);*/
        edtTotal = (EditText) findViewById(R.id.edtTotalcasa);
        tvescondido = (EditText) findViewById(R.id.tvescondido);

        /*btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = 0;
                if (btAssolan.isPressed())
                    total += 2.0;
                if (btVeja.isActivated())
                    total += 6.99;
                if (btPano.isSelected())
                    total += 5.0;
                if (btToalha.isSelected())
                    total += 0;
                Double E = total;
                edtTotal.setText(E.toString());

                Intent casa = new Intent(getApplicationContext(), finalizando_compras.class);
                casa.putExtra("house", edtTotal.getText().toString());
                startActivity(casa);
                }
           });*/
        crdAssolan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double assolan = 5;
                Double E = assolan;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_casa = new
                        AlertDialog.Builder(casa.this);
                dialogo_da_casa.setTitle("CARRINHO");
                dialogo_da_casa.setMessage(" Quanto deste item você quer ?   " +String.valueOf(assolan));
                final EditText quantidade = new EditText(casa.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_casa.setView(quantidade);
                dialogo_da_casa.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtAssolan.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent assolan = new Intent(getApplicationContext(),finalizando_compras.class);
                        assolan.putExtra("house",edtTotal.getText().toString());
                        startActivity(assolan);

                        Toast.makeText(casa.this,"Foi Adicionado  "+quantidade_final+" Assolan"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_casa.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_casa.setCancelable(false);
                dialogo_da_casa.show();
            }
        });


        crdPano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pano = 1.99;
                Double E = pano;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_casa = new
                        AlertDialog.Builder(casa.this);
                dialogo_da_casa.setTitle("CARRINHO");
                dialogo_da_casa.setMessage(" Quanto deste item você quer ?   " +String.valueOf(pano));
                final EditText quantidade = new EditText(casa.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_casa.setView(quantidade);
                dialogo_da_casa.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPano.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(casa.this,"Foi Adicionado  "+quantidade_final+" Pano/s"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_casa.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_casa.setCancelable(false);
                dialogo_da_casa.show();
            }
        });
        crdToalha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double toalha = 69.90;
                Double E = toalha;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_casa = new
                        AlertDialog.Builder(casa.this);
                dialogo_da_casa.setTitle("CARRINHO");
                dialogo_da_casa.setMessage(" Quanto deste item você quer ?   " +String.valueOf(toalha));
                final EditText quantidade = new EditText(casa.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_casa.setView(quantidade);
                dialogo_da_casa.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtToalha.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(casa.this,"Foi Adicionado  "+quantidade_final+" Toalha/s"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_casa.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_casa.setCancelable(false);
                dialogo_da_casa.show();
            }
        });
        crdVeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double veja = 6.99;
                Double E = veja;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_casa = new
                        AlertDialog.Builder(casa.this);
                dialogo_da_casa.setTitle("CARRINHO");
                dialogo_da_casa.setMessage(" Quanto deste item você quer ?   " +String.valueOf(veja));
                final EditText quantidade = new EditText(casa.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_casa.setView(quantidade);
                dialogo_da_casa.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtVeja.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent veja = new Intent(getApplicationContext(),finalizando_compras.class);
                        veja.putExtra("house",edtTotal.getText().toString());
                        startActivity(veja);

                        Toast.makeText(casa.this,"Foi Adicionado  "+quantidade_final+" Veja/s"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_casa.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_casa.setCancelable(false);
                dialogo_da_casa.show();
            }
        });




    }
}
