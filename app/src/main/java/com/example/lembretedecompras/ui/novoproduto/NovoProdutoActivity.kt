package com.example.lembretedecompras.ui.novoproduto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lembretedecompras.R
import com.example.lembretedecompras.databinding.ActivityMainBinding
import com.example.lembretedecompras.databinding.ActivityNovoProdutoBinding

class NovoProdutoActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PRODUTO = "EXTRA_PRODUTO"
    }

    private lateinit var binding: ActivityNovoProdutoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNovoProdutoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSalvar.setOnClickListener {
            val respostaIntent = Intent()
            val produto = binding.etProduto.text.toString()
            if(produto.isEmpty()) {
                setResult(RESULT_CANCELED, respostaIntent)
            } else {
                respostaIntent.putExtra(EXTRA_PRODUTO, produto)
                setResult(RESULT_OK, respostaIntent)
            }
            finish()
        }
    }
}