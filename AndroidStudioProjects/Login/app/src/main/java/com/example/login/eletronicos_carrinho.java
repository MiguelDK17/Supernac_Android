package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class eletronicos_carrinho extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletronicos_carrinho);
        Button Total;
        CheckBox chkChuveiro,chkMultímetro,chkCapacitor;
        EditText edtTotal;
        /*chkCapacitor = (CheckBox) findViewById(R.id.chkCapacitor);
        chkMultímetro = (CheckBox) findViewById(R.id.chkMultímetro);
        chkChuveiro = (CheckBox) findViewById(R.id.chkChuveiro);
        edtTotal = (EditText) findViewById(R.id.edtTotaleletro);
        Total = (Button) findViewById(R.id.btTotaleletro);
        Total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double  total = 0;
                if (chkCapacitor.isChecked())
                    total += 0.20;
                if (chkMultímetro.isChecked())
                    total += 37.97;
                if (chkChuveiro.isChecked())
                    total += 59.99;

                Double E = total;
                edtTotal.setText(E.toString());
                Intent eletro = new Intent(getApplicationContext(),finalizando_compras.class);
                eletro.putExtra("house",edtTotal.getText().toString());
                startActivity(eletro);
            }
        });
    */}
}