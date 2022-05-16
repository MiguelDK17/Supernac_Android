package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.login.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Login {


    public class MainActivity extends AppCompatActivity {
        EditText edUsuario,edSenha;
        Button btEntrar;
        String usuario,senha;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            edUsuario = (EditText) findViewById(R.id.tLogin);
            edSenha = (EditText) findViewById(R.id.tSenha);
            btEntrar = (Button) findViewById(R.id.btLogin);
            btEntrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    usuario = edUsuario.getText().toString();
                    senha = edSenha.getText().toString();
                    if (!usuario.isEmpty() && !senha.isEmpty()) {
                        validarusuario("http://10.0.2.2/mysqlapp/validar_usuario.php");

                    }else {
                        Toast.makeText(getApplicationContext(),"Nome de usuario ou senha incorretos :(",Toast.LENGTH_SHORT).show();}
                }





                private void validarusuario (String URL){
                    StringRequest stringRequest= new StringRequest(Request.Method.POST,URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if (!response.isEmpty()) {
                                Salvar_Sessão();
                                Intent it = new Intent(getApplicationContext(),MainActivity2.class);
                                startActivity(it);
                            }else{
                                Toast.makeText(MainActivity.this,"Usuário ou senha incorretos :(".toString(),Toast.LENGTH_SHORT).show();
                            }
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(MainActivity.this,error.toString(),Toast.LENGTH_SHORT).show();
                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String,String> parametros = new HashMap<String,String>();
                            parametros.put("usuario",usuario);
                            parametros.put("senha",senha);
                            return parametros;
                        }
                    };
                    RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                    requestQueue.add(stringRequest);
                }
                private void Salvar_Sessão(){
                    SharedPreferences preferences = getSharedPreferences("PreferenceLogin", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("usuario",usuario);
                    editor.putString("senha",senha);
                    editor.putBoolean("sessão",true);
                    editor.commit();
                }
                private void recuperar_sessão(){
                    SharedPreferences preferences = getSharedPreferences("PreferenceLogin",Context.MODE_PRIVATE);
                    edUsuario.setText(preferences.getString("usuario",""));
                    edSenha.setText(preferences.getString("senha",""));
                }
            });
        }}

}
