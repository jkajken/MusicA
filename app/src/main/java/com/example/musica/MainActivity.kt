package com.example.musica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.musica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var fragment: PlaylistFragment = PlaylistFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       supportFragmentManager.beginTransaction().replace(R.id.Container,fragment).commit()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}