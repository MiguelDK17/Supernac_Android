package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.text.DecimalFormat;

public class alimentos extends AppCompatActivity {
    EditText edtTotal;
    CheckBox chkdoritos,chklombo,chklinguiça;
    Button btTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos);
        /*chkdoritos = (CheckBox) findViewById(R.id.chkdoritos);
        chklinguiça = (CheckBox) findViewById(R.id.chklinguiça);
        chklombo = (CheckBox) findViewById(R.id.chklombo);
        btTotal = (Button) findViewById(R.id.btTotalalimentos);
        edtTotal = (EditText) findViewById(R.id.edttotalalimentos);
        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            //Não coloque ponto e vírgula nos 'ifs'
            public void onClick(View v) {
                double total = 0;
                if(chkdoritos.isChecked())
                    total +=4.85;
                if(chklinguiça.isChecked())
                    total +=19.99;
                if(chklombo.isChecked())
                    total +=23.99;
                Double E = total;
                edtTotal.setText(E.toString());
                Intent alimentos = new Intent(getApplicationContext(),finalizando_compras.class);
                alimentos.putExtra("house",edtTotal.getText().toString());
                startActivity(alimentos);
            }
        });
    */}
}