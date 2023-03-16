package com.berkayozdag.sausocial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.berkayozdag.sausocial.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            splashLayout.alpha = 0f
            splashLayout.animate().setDuration(2000).alpha(1f).withEndAction {
                startActivity(
                    Intent(this@SplashActivity, MainActivity::class.java)
                )
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }
        }
    }
}