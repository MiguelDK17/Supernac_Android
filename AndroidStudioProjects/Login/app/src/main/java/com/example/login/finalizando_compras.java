package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class finalizando_compras extends AppCompatActivity {
    TextView tvRecebe,txtValorBrinde,tvObrigado;
    EditText edtValorPago;
    TextView txtValorTroco;
    Button Calcular,btSalvar,btCarregar;
    String TotalCarrinhoFinalizado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizando_compras);

        tvRecebe = (TextView) findViewById(R.id.tvRecebeTexto);
        String valor = getIntent().getStringExtra("house");
        String eletro = getIntent().getStringExtra("house");
        String alimentos = getIntent().getStringExtra("house");
        String casa = getIntent().getStringExtra("house");
        String informatica = getIntent().getStringExtra("house");
        String assolan = getIntent().getStringExtra("house");

        tvRecebe.setText(informatica);
        tvRecebe.setText(valor);
        tvRecebe.setText(eletro);
        tvRecebe.setText(alimentos);
        tvRecebe.setText(casa);
        tvRecebe.setText(assolan);

        tvRecebe.requestFocus();

        edtValorPago = (EditText) findViewById(R.id.editTextValorPago);
        txtValorTroco = (TextView) findViewById(R.id.textViewTroco);
        txtValorBrinde = (TextView) findViewById(R.id.textViewSimNão);
        Calcular = (Button) findViewById(R.id.btCalcularCompra);
        tvObrigado = (TextView) findViewById(R.id.tvObrigado);
        btSalvar = (Button) findViewById(R.id.btSalvarValorCarrinho);
        btCarregar = (Button) findViewById(R.id.btCarregar);


        //Comando para colocar R$ no valor pago pelo cliente
        /*SimpleMaskFormatter smf = new SimpleMaskFormatter("R$NNNN.NN ");
        MaskTextWatcher mtw = new MaskTextWatcher(edtValorPago, smf);
        edtValorPago.addTextChangedListener(mtw);*/

        //Fim da Máscara

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = getSharedPreferences("chaveGeral-xml",MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("Chavepreco",tvRecebe.getText().toString());
                editor.commit();
                Toast.makeText(finalizando_compras.this,"Valor Salvo Com Sucesso !!!",Toast.LENGTH_LONG).show();
            }
        });
        btCarregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String preco;
                SharedPreferences prefs2 = getSharedPreferences("chaveGeral-xml",MODE_PRIVATE);
                preco=prefs2.getString("Chavepreco","");
                tvRecebe.setText(preco);
            }
        });}

    public void finalizarCompra (View v){

        double ValorCompra = Double.parseDouble(tvRecebe.getText().toString());
        double ValorPago = Double.parseDouble(edtValorPago.getText().toString());
        double ValorTroco = ValorPago  - ValorCompra;



        //Comando pra duas casas decimais
        txtValorTroco.setText("R$ "+new DecimalFormat(".##").format(ValorTroco));

        if (ValorCompra >=100){
            txtValorBrinde.setText("SIM");
        }else {
            txtValorBrinde.setText("NÃO");
        }


        }
    private void alert (String s) {
        Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
}

}