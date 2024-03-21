package com.example.pokemon.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.pokemon.R
import com.example.pokemon.data.model.Pokemon
import com.example.pokemon.view.adapter.PokemonListener
import com.example.pokemon.view.fragment.PokemonFragment

class MainActivity : AppCompatActivity(),PokemonListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(PokemonFragment())
    }





    private fun replaceFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host,fragment).addToBackStack(null).commit()


    }

    override fun onCLickPokemon(pokemon: Pokemon) {
        val url=pokemon.url
        Toast.makeText(this, "Url: $url", Toast.LENGTH_LONG).show()
    }


}



