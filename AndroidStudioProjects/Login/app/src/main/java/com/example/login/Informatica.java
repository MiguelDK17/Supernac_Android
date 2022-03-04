package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Informatica extends AppCompatActivity {
    CheckBox chkIphone,chkMacBook,chkRoteador,chkCabo;
    Button btTotal;
    EditText edtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatica);
        chkIphone = (CheckBox) findViewById(R.id.chkIphone);
        chkRoteador = (CheckBox) findViewById(R.id.chkRoteador);
        chkCabo = (CheckBox) findViewById(R.id.chkCabo);
        chkMacBook = (CheckBox) findViewById(R.id.chkMacBook);
        btTotal =(Button) findViewById(R.id.btTotalinformática);
        edtTotal = (EditText) findViewById(R.id.edtTotalinfo);
        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = 0;
                if (chkRoteador.isChecked())
                    total +=1799;
                if (chkIphone.isChecked())
                    total +=4799.90;
                if (chkMacBook.isChecked())
                    total +=7500;
                if (chkCabo.isChecked())
                    total +=15.00;
                Double E = total;
                edtTotal.setText(E.toString());
                Intent informatica = new Intent(getApplicationContext(),finalizando_compras.class);
                informatica.putExtra("house",edtTotal.getText().toString());
                startActivity(informatica);
            }
        });
    }
}