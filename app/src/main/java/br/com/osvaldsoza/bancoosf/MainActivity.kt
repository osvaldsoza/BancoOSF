package br.com.osvaldsoza.bancoosf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.osvaldsoza.bancoosf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSaldo.setOnClickListener {
            var intent = Intent(this,SaldoActivity::class.java)
            startActivity(intent)
            finish()
        }

//        binding.imgPoupanca.setOnClickListener {
//            var intent = Intent(this,PoupancaActivity::class.java)
//            startActivity(intent)
//        }

//        binding.imgFaturas.setOnClickListener {
//            var intent = Intent(this,FaturaActivity::class.java)
//            startActivity(intent)
//        }
//
//        binding.imgTransferencia.setOnClickListener {
//            var intent = Intent(this,TransferenciaActivity::class.java)
//            startActivity(intent)
//        }
    }
}