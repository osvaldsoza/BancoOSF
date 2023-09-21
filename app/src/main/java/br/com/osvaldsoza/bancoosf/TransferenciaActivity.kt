package br.com.osvaldsoza.bancoosf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.osvaldsoza.bancoosf.databinding.ActivityTransferenciaBinding

class TransferenciaActivity : AppCompatActivity() {

    private lateinit var binding:ActivityTransferenciaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        var toolbar = binding.toolbarTransferencia
        toolbar.title="Transferência"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(200,0,200,0)
        toolbar.setNavigationIcon(R.drawable.ic_voltar)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}