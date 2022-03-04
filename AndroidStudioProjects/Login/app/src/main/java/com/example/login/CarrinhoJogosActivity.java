package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class CarrinhoJogosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho_jogos);
        CheckBox chkPS4,chkPS4MEGA,chkPS4SPIDER;
        EditText edtTotal;
        Button btTotal;
        chkPS4 = (CheckBox) findViewById(R.id.chkPS4SLIM);
        chkPS4MEGA = (CheckBox) findViewById(R.id.chkPS4MEGA);
        chkPS4SPIDER = (CheckBox) findViewById(R.id.chkPS4SPIDERMAN);
        edtTotal = (EditText) findViewById(R.id.editTextTotalCompra);
        btTotal = (Button) findViewById(R.id.btTotal);
        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = 0;
                if (chkPS4.isChecked())
                    total += 2399;
                if (chkPS4MEGA.isChecked())
                    total += 2999;
                if (chkPS4SPIDER.isChecked())
                    total += 2499;

                Double E = total;
                edtTotal.setText(E.toString());
                Intent jogos = new Intent(getApplicationContext(),finalizando_compras.class);
                jogos.putExtra("house",edtTotal.getText().toString());
                startActivity(jogos);



                //AlertDialog.Builder dialogo = new
                        //AlertDialog.Builder(CarrinhoJogosActivity.this);
                //dialogo.setTitle("AVISO");
                //dialogo.setMessage("Valor total da compra:"+String.valueOf(total));
                //dialogo.setNeutralButton("OK",null);
                //dialogo.show();


            }
        });


    }
}