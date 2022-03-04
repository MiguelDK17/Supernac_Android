package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class carrinho_eletronicos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //(R.layout.eletronicos_carrinho);
        CheckBox chkResistor,chkCapacitor,chkMultimetro;
        Button btTotal;
        //chkCapacitor = (CheckBox) findViewById(R.id.checkBoxCapacitor);
        //chkMultimetro = (CheckBox) findViewById(R.id.checkBoxMultímetro);
        //chkResistor = (CheckBox) findViewById(R.id.checkBoxResistor);
        //btTotal = (Button) findViewById(R.id.btTotal2);
        //btTotal.setOnClickListener(new View.OnClickListener() {
            double total = 0;
           // public void onClick(View v) {
                //if (chkCapacitor.isChecked())
                    total+= 0.48;
                //if (chkMultimetro.isChecked())
                    total+= 64.99;
                //if (chkResistor.isChecked())
                    total+= 67.20;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(carrinho_eletronicos.this);
                dialogo.setTitle("AVISO");
                dialogo.setMessage("Valor total da compra:"+String.valueOf(total));
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        //});


    }
//}