package br.com.osvaldsoza.bancoosf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.osvaldsoza.bancoosf.databinding.ActivityFaturaBinding

class FaturaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFaturaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFaturaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        var toolbar = binding.toolbarFaturas
        toolbar.title = "Faturas"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setTitleMargin(300, 0, 300, 0)
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}