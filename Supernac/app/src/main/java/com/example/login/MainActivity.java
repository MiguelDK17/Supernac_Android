package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //declaração de variável
    TextView tvCadastro,tvVersão;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaração das variáveis e captura do id dos componentes
        tvCadastro = (TextView) findViewById(R.id.tvCadastro);
        tvVersão = (TextView) findViewById(R.id.tvVersão);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        TextView tvesqueceu = (TextView) findViewById(R.id.tvesqueceu);
        //ação do botão
        /*btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = (EditText) findViewById(R.id.tLogin);
                TextView tSenha = (EditText) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if (login.equals("MIGUEL")&&senha.equals("1234")) {
                    alert("LOGIN REALIZADO COM SUCESSO!!!");
                    Intent it = new Intent(getApplicationContext(),MainActivity2.class);
                    it.putExtra("blueberry",tLogin.getText().toString());
                    startActivity(it);
                }
                if (login.equals("Miguel")&&senha.equals("1234")){
                    alert("LOGIN REALIZADO COM SUCESSO!!!");
                    Intent nova = new Intent(getApplicationContext(),MainActivity2.class);
                    nova.putExtra("blueberry",tLogin.getText().toString());
                    startActivity(nova);
                }
                else{
                    alert("NOME DE USUÁRIO OU SENHA INCORRETOS");

                }

                }


        });
        tvVersão.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent versão = new Intent(getApplicationContext(), Let_It_Be.class);
                startActivity(versão);
            }
        });
                tvesqueceu.setPaintFlags(tvesqueceu.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                tvesqueceu.setText("Esqueceu a senha ?");

                tvCadastro.setPaintFlags(tvCadastro.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                tvCadastro.setText("É novo no app?  Cadastre-se !!!");

                tvVersão.setPaintFlags(tvVersão.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                tvVersão.setText("Versão 3.0 - Let It Be");
    }

    private void alert (String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();}



*/}}


