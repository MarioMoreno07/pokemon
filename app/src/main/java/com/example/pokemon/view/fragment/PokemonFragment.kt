package com.example.pokemon.view.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.R
import com.example.pokemon.data.model.Pokemon
import com.example.pokemon.view.adapter.PokemonAdapter
import com.example.pokemon.view.adapter.PokemonListener
import org.json.JSONObject


class PokemonFragment : Fragment(),PokemonListener {

    private lateinit var pokemons:List<Pokemon>
    private lateinit var pokemonAdapter: PokemonAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =inflater.inflate(R.layout.fragment_pokemon, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerPokemon)
        recyclerView.layoutManager= LinearLayoutManager(requireContext())

        val pc : TextView = view.findViewById(R.id.textView2)

        pc.setOnClickListener {
            pokemons=obtenerPokemon()
            pokemonAdapter= PokemonAdapter(pokemons,this,requireContext())
            recyclerView.adapter=pokemonAdapter
        }




        return view
    }

    override fun onCLickPokemon(pokemon: Pokemon) {

        Toast.makeText(context, "Url: "+pokemon.url,Toast.LENGTH_LONG).show()

    }


    private fun obtenerPokemon():List<Pokemon>{
        val listaPokemons= mutableListOf<Pokemon>()

        val jsonObject=JSONObject(jsonString)
        val jsonArray=jsonObject.getJSONArray("listadepokemons")


        for(i in 0 until jsonArray.length() ){
            val pokemonJson=jsonArray.getJSONObject(i)
            val name=pokemonJson.getString("name")
            val defaultSprite=pokemonJson.getString("defaultSprite")
            val url = pokemonJson.getString("url")

            listaPokemons.add(Pokemon(name,defaultSprite,url))
        }

        return listaPokemons
    }






}