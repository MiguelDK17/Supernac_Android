package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.os.Bundle
import com.example.login.R
import android.widget.Toast
import com.android.volley.toolbox.StringRequest
import android.content.Intent
import com.example.login.MainActivity2
import com.android.volley.VolleyError
import kotlin.Throws
import com.android.volley.AuthFailureError
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import android.content.SharedPreferences
import android.view.View
import android.widget.Button
import com.android.volley.Response
import java.util.HashMap

class MainActivity : AppCompatActivity() {
    //declaração de variável
    var tvCadastro: TextView? = null
    var tvVersão: TextView? = null
    var edUsuario: EditText? = null
    var edSenha: EditText? = null
    var btEntrar: Button? = null
    var usuario: String? = null
    var senha: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edUsuario = findViewById<View>(R.id.tLogin) as EditText
        edSenha = findViewById<View>(R.id.tSenha) as EditText
        btEntrar = findViewById<View>(R.id.btLogin) as Button
        btEntrar!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                usuario = edUsuario!!.text.toString()
                senha = edSenha!!.text.toString()
                if (!usuario!!.isEmpty() && !senha!!.isEmpty()) {
                    validarusuario("http://10.0.2.2/Supernac_Android/AndroidStudioProjects/Versão 3.0/Login/validar_usuario.php")
                } else {
                    Toast.makeText(
                        applicationContext,
                        "Nome de usuario ou senha incorretos :(",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            private fun validarusuario(URL: String) {
                val stringRequest: StringRequest = object : StringRequest(
                    Method.POST,
                    URL,
                    Response.Listener { response ->
                        if (!response.isEmpty()) {
                            Salvar_Sessão()
                            val it = Intent(applicationContext, MainActivity2::class.java)
                            it.putExtra("blueberry", edUsuario!!.text.toString())
                            startActivity(it)
                        } else {
                            Toast.makeText(
                                this@MainActivity,
                                "Usuário ou senha incorretos :(",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    },
                    Response.ErrorListener { error ->
                        Toast.makeText(
                            this@MainActivity,
                            error.toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }) {
                    @Throws(AuthFailureError::class)
                    override fun getParams(): Map<String, String>? {
                        val parametros: MutableMap<String, String> = HashMap()
                        parametros["usuario"] = usuario!!
                        parametros["senha"] = senha!!
                        return parametros
                    }
                }
                val requestQueue = Volley.newRequestQueue(this@MainActivity)
                requestQueue.add(stringRequest)
            }

            private fun Salvar_Sessão() {
                val preferences = getSharedPreferences("PreferenceLogin", MODE_PRIVATE)
                val editor = preferences.edit()
                editor.putString("usuario", usuario)
                editor.putString("senha", senha)
                editor.putBoolean("sessão", true)
                editor.commit()
            }

            private fun recuperar_sessão() {
                val preferences = getSharedPreferences("PreferenceLogin", MODE_PRIVATE)
                edUsuario!!.setText(preferences.getString("usuario", ""))
                edSenha!!.setText(preferences.getString("senha", ""))
            }
        })
    }
}