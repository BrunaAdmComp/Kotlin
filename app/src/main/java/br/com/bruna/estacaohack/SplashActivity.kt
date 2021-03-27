package br.com.bruna.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//Criando a intenção de ir para a LoginActivity
        val intentTelaLogin = Intent(this@SplashActivity, LoginActivity::class.java)

                Handler().postDelayed({
                    //Iniciando a LoginActivity (executando a LoginActivity)
            startActivity(intentTelaLogin)
                    //Finalizando a LoginActivity
            finish()
        },3000)

    }
}
