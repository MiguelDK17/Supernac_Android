package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView tvCadastro,tvVersão;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvCadastro = (TextView) findViewById(R.id.tvCadastro);
        tvVersão = (TextView) findViewById(R.id.tvVersão);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        TextView tvesqueceu = (TextView) findViewById(R.id.tvesqueceu);
        btLogin.setOnClickListener(new View.OnClickListener() {
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
                /*if (login.equals("")&&senha.equals("")){
                    alert("LOGIN REALIZADO COM SUCESSO!!!");
                    Intent it = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(it);
                }*/
                if (login.equals("")&&senha.equals("")){
                    alert("LOGIN REALIZADO COM SUCESSO!!!");
                    Intent vazia = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(vazia);
                }
                else{
                    alert ("USUÁRIO OU SENHA INCORRETOS");
                    }
                }


        });
                tvesqueceu.setPaintFlags(tvesqueceu.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                tvesqueceu.setText("Esqueceu a senha ?");

                tvCadastro.setPaintFlags(tvCadastro.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                tvCadastro.setText("É novo no app?  Cadastre-se !!!");

                tvVersão.setPaintFlags(tvVersão.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                tvVersão.setText("Versão 2.8 - Abbey Road");
    }
    private void alert (String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();}


    public void OnClick(View view) {
        Intent hello = new Intent(getApplicationContext(),teste.class);
        startActivity(hello);
    }
}


