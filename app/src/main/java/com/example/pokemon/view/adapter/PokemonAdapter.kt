package com.example.pokemon.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemon.data.model.Pokemon
import com.example.pokemon.databinding.ViewPokemonBinding

class PokemonAdapter (
    private val pokemons:List<Pokemon>,
    private val listener:PokemonListener,
    private val context:Context
):RecyclerView.Adapter<PokemonAdapter.ViewHolder>(){



    inner class ViewHolder(private val binding:ViewPokemonBinding):
        RecyclerView.ViewHolder(binding.root), View.OnClickListener{



        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                val pokemon = pokemons[position]
                listener.onCLickPokemon(pokemon)
            }
        }


        fun bind(pokemon: Pokemon){
            with(binding){
                name.text=pokemon.name
                Glide.with(context).load(pokemon.defaultSprite).into(defaultSprite)
                url.text=pokemon.url

            }

        }

        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
       val binding=ViewPokemonBinding.inflate(
           LayoutInflater.from(parent.context),
           parent,
           false
       )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonAdapter.ViewHolder, position: Int) {
       val pokemon=pokemons[position]
        holder.bind(pokemon)
    }

    override fun getItemCount()=pokemons.size



}


