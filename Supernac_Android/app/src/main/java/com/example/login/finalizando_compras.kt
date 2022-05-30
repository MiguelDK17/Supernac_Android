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
import com.example.login.databinding.ActivityFinalizandoComprasBinding
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

import java.text.DecimalFormat
import java.util.prefs.Preferences

class finalizando_compras : AppCompatActivity() {
    val Context.dataStore: DataStore<androidx.datastore.preferences.core.Preferences> by preferencesDataStore("darling")
    private lateinit var binding: ActivityFinalizandoComprasBinding
    var btCalcular: Button? = null
    var TotalCarrinhoFinalizado: String? = null
    var Total: String? = null
    var Total2: String? = null
    var resultado: String? = null
    var valor2: String? = null
    var valor1: String? = null
    var preco: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalizando_compras)
        //tvRecebe!!.requestFocus()
        val view = binding.root
        setContentView(view)
        binding.tvRecebe
        binding.tvInformacao
        binding.tvObrigado
        binding.txtValorBrinde
        binding.txtValorTroco
        binding.btSalvar
        binding.btCarregar
        binding.btLimpar
        binding.btCalcularCompra
        binding.btSalvaDepois
        binding.btRecuperaDepois

        val valor = intent.getStringExtra("house")
        val eletro = intent.getStringExtra("house")
        val alimentos = intent.getStringExtra("house")
        val casa = intent.getStringExtra("house")
        val informatica = intent.getStringExtra("house")
        val assolan = intent.getStringExtra("house")

        binding.tvRecebe!!.text = informatica
        binding.tvRecebe!!.text = valor
        binding.tvRecebe!!.text = eletro
        binding.tvRecebe!!.text = alimentos
        binding.tvRecebe!!.text = casa
        binding.tvRecebe!!.text = assolan


        //Comando para colocar R$ no valor pago pelo cliente
        /*SimpleMaskFormatter smf = new SimpleMaskFormatter("R$NNNN.NN ");
        MaskTextWatcher mtw = new MaskTextWatcher(edtValorPago, smf);
        edtValorPago.addTextChangedListener(mtw);*/

        //Fim da Máscara
        binding.btSalvar!!.setOnClickListener {


            val prefs = getSharedPreferences("chaveGeral-xml", MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putString("Chavepreco", binding.tvRecebe!!.text.toString())
            editor.commit()
            Toast.makeText(this@finalizando_compras, "Valor Salvo Com Sucesso !!!", Toast.LENGTH_LONG).show()

            //Fazer um botão extra pra levar pra outra tela

            /*Intent save = new Intent(finalizando_compras.this,categoria.class);
                startActivity(save);*/

        }
        binding.btSalvaDepois!!.setOnClickListener{
            val builder = AlertDialog.Builder(this@finalizando_compras)
            builder.setTitle("AVISO")
            builder.setMessage("Se quiser salvar para depois,deverá fechar o app após a requisição ser completada,deseja continuar ?")
            builder.setPositiveButton("Sim,desejo continuar"){dialog,which ->
                lifecycleScope.launch {
                    val key = binding.edtChave!!.text?.toString() ?: ""
                    val value = binding.tvRecebe!!.text?.toString() ?: ""
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
        binding.btCarregar!!.setOnClickListener {
            val prefs2 = getSharedPreferences("chaveGeral-xml", MODE_MULTI_PROCESS)
            preco = prefs2.getString("Chavepreco", "")
            val message = binding.tvRecebe!!.text.toString();
            if (message =="0") binding.tvRecebe!!.text = preco else {
                valor1 = preco!!.trim { it <= ' ' }
                valor2 = binding.tvRecebe!!.text.toString().trim { it <= ' ' }
                val valor3 = valor1!!.toDouble()
                val valor4 = valor2!!.toDouble()
                val valor_final = valor3 + valor4
                binding.tvRecebe!!.text = valor_final.toString()
            }
        }
        binding.btRecuperaDepois!!.setOnClickListener{
            lifecycleScope.launch {
                val key = binding.edtChave!!.text.toString() ?: ""
                binding.tvRecebe!!.text = recuperar_dados(key) ?: "Nenhum valor encontrado para a chave " + key
                Toast.makeText(this@finalizando_compras,"Valor Recuperado da Memória com sucesso !!!",Toast.LENGTH_LONG).show()

            }
        }
        binding.btLimpar!!.setOnClickListener {
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
        val ValorCompra = binding.tvRecebe!!.text.toString().toDouble()
        val ValorPago = binding.edtValorPago!!.text.toString().toDouble()
        val ValorTroco = ValorPago - ValorCompra


        //Comando pra duas casas decimais
        binding.txtValorTroco!!.text = "R$ " + DecimalFormat(".##").format(ValorTroco)
        if (ValorCompra >= 100) {
            binding.txtValorBrinde!!.text = "SIM"
        } else {
            binding.txtValorBrinde!!.text = "NÃO"
        }
    }

    private fun alert(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}