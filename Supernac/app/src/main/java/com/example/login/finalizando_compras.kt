package com.example.login


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.os.Bundle
import com.example.login.R
import android.content.SharedPreferences

import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.SharedPreferencesMigration
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.rxjava2.RxPreferenceDataStoreBuilder
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

import java.text.DecimalFormat
import java.util.prefs.Preferences

class finalizando_compras : AppCompatActivity() {
    val Context.dataStore: DataStore<androidx.datastore.preferences.core.Preferences> by preferencesDataStore("darling")
    var tvRecebe: TextView? = null
    var txtValorBrinde: TextView? = null
    var tvObrigado: TextView? = null
    var edtValorPago: EditText? = null
    var txtValorTroco: TextView? = null
    var Calcular: Button? = null
    var btSalvar: Button? = null
    var btCarregar: Button? = null
    var btCalcular: Button? = null
    var TotalCarrinhoFinalizado: String? = null
    var Total: String? = null
    var Total2: String? = null
    var resultado: String? = null
    var valor2: String? = null
    var valor1: String? = null
    var preco: String? = null
    var edtChave: EditText? = null
    var tvInformação: TextView? = null
    var btSalva_Depois: Button? = null
    var btRecupera_Depois:Button? = null
    var btLimpar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalizando_compras)
        tvRecebe = findViewById<View>(R.id.tvRecebeTexto) as TextView
        val valor = intent.getStringExtra("house")
        val eletro = intent.getStringExtra("house")
        val alimentos = intent.getStringExtra("house")
        val casa = intent.getStringExtra("house")
        val informatica = intent.getStringExtra("house")
        val assolan = intent.getStringExtra("house")

        tvRecebe!!.text = informatica
        tvRecebe!!.text = valor
        tvRecebe!!.text = eletro
        tvRecebe!!.text = alimentos
        tvRecebe!!.text = casa
        tvRecebe!!.text = assolan
        //tvRecebe!!.requestFocus()
        edtValorPago = findViewById<View>(R.id.editTextValorPago) as EditText
        txtValorTroco = findViewById<View>(R.id.textViewTroco) as TextView
        txtValorBrinde = findViewById<View>(R.id.textViewSimNão) as TextView
        edtChave = findViewById<EditText>(R.id.tvChave) as EditText
        tvInformação = findViewById<EditText>(R.id.tvCertoErrado) as TextView
        tvObrigado = findViewById<View>(R.id.tvObrigado) as TextView
        btSalvar = findViewById<View>(R.id.btSalvarValorCarrinho) as Button
        btCarregar = findViewById<View>(R.id.btCarregar) as Button
        btSalva_Depois = findViewById<Button>(R.id.btdatastore) as Button
        btRecupera_Depois = findViewById<Button>(R.id.recuperar_dados) as Button
        btLimpar = findViewById(R.id.btLimpar) as Button









        //Comando para colocar R$ no valor pago pelo cliente
        /*SimpleMaskFormatter smf = new SimpleMaskFormatter("R$NNNN.NN ");
        MaskTextWatcher mtw = new MaskTextWatcher(edtValorPago, smf);
        edtValorPago.addTextChangedListener(mtw);*/

        //Fim da Máscara
        btSalvar!!.setOnClickListener {


            val prefs = getSharedPreferences("chaveGeral-xml", MODE_MULTI_PROCESS)
            val editor = prefs.edit()
            editor.putString("Chavepreco", tvRecebe!!.text.toString())
            editor.commit()
            Toast.makeText(this@finalizando_compras, "Valor Salvo Com Sucesso !!!", Toast.LENGTH_LONG).show()

            //Fazer um botão extra pra levar pra outra tela

            /*Intent save = new Intent(finalizando_compras.this,categoria.class);
                startActivity(save);*/

        }
        btSalva_Depois!!.setOnClickListener{
            val builder = AlertDialog.Builder(this@finalizando_compras)
            builder.setTitle("AVISO")
            builder.setMessage("Se quiser salvar para depois,deverá fechar o app após a requisição ser completada,deseja continuar ?")
            builder.setPositiveButton("Sim,desejo continuar"){dialog,which ->
                lifecycleScope.launch {
                    val key = edtChave!!.text?.toString() ?: ""
                    val value = tvRecebe!!.text?.toString() ?: ""
                    salvar_dados(key, value)
                    Toast.makeText(this@finalizando_compras,"Valor Salvo na Memória Com Sucesso  !!!",Toast.LENGTH_LONG).show()
                }

            }
            builder.setNegativeButton("Não,desejo continuar comprando"){_,_->
                Toast.makeText(this,"Você cancelou a ação",Toast.LENGTH_SHORT).show()
            }
            val dialog:AlertDialog = builder.create()
            dialog.show()




        }
        btCarregar!!.setOnClickListener {
            val prefs2 = getSharedPreferences("chaveGeral-xml", MODE_MULTI_PROCESS)
            preco = prefs2.getString("Chavepreco", "")
            val message = tvRecebe!!.text.toString();
            if (message =="0") tvRecebe!!.text = preco else {
                valor1 = preco!!.trim { it <= ' ' }
                valor2 = tvRecebe!!.text.toString().trim { it <= ' ' }
                val valor3 = valor1!!.toDouble()
                val valor4 = valor2!!.toDouble()
                val valor_final = valor3 + valor4
                tvRecebe!!.text = valor_final.toString()
            }
        }
        btRecupera_Depois!!.setOnClickListener{
            lifecycleScope.launch {
                val key = edtChave!!.text.toString() ?: ""
                tvRecebe!!.text = recuperar_dados(key) ?: "Nenhum valor encontrado para a chave " + key
                Toast.makeText(this@finalizando_compras,"Valor Recuperado da Memória com sucesso !!!",Toast.LENGTH_LONG).show()

            }
        }
        btLimpar!!.setOnClickListener {
            lifecycleScope.launch{
                dataStore.edit {
                    it.clear()
                    Toast.makeText(this@finalizando_compras,"Dados limpos com sucesso !!!",Toast.LENGTH_LONG).show()
                }
            }
        }



    }
    private suspend fun salvar_dados(key: String,value: String){
        val prefsKey = stringPreferencesKey(key)
        dataStore.edit { darling ->
            darling [prefsKey] = value
        }

    }
    private  suspend fun recuperar_dados(key: String): String? {
        val prefsKey = stringPreferencesKey(key)
        val prefs = dataStore.data.first()
        return prefs[prefsKey]
    }

    fun finalizarCompra(v: View?) {
        val ValorCompra = tvRecebe!!.text.toString().toDouble()
        val ValorPago = edtValorPago!!.text.toString().toDouble()
        val ValorTroco = ValorPago - ValorCompra


        //Comando pra duas casas decimais
        txtValorTroco!!.text = "R$ " + DecimalFormat(".##").format(ValorTroco)
        if (ValorCompra >= 100) {
            txtValorBrinde!!.text = "SIM"
        } else {
            txtValorBrinde!!.text = "NÃO"
        }
    }

    private fun alert(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}