package com.example.pokemon.view.adapter

import com.example.pokemon.data.model.Pokemon

interface PokemonListener {

    fun onCLickPokemon(pokemon: Pokemon)


    val jsonString: String
        get() = """
            { 
             "listadepokemons":
            [ { "name": "bulbasaur", 
                "url": "https://pokeapi.co/api/v2/pokemon/1/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png" },
            { "name": "ivysaur", 
                "url": "https://pokeapi.co/api/v2/pokemon/2/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png" },
            { "name": "venusaur", 
                 "url": "https://pokeapi.co/api/v2/pokemon/3/", 
                 "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png" }, 
            { "name": "charmander", 
                "url": "https://pokeapi.co/api/v2/pokemon/4/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png" }, 
            { "name": "charmeleon", 
                "url": "https://pokeapi.co/api/v2/pokemon/5/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png" }, 
            { "name": "charizard", 
                "url": "https://pokeapi.co/api/v2/pokemon/6/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png" }, 
            { "name": "squirtle", 
                "url": "https://pokeapi.co/api/v2/pokemon/7/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png" }, 
            { "name": "wartortle", 
                "url": "https://pokeapi.co/api/v2/pokemon/8/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png" }, 
            { "name": "blastoise", 
                "url": "https://pokeapi.co/api/v2/pokemon/9/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png" },
            { "name": "caterpie", 
                "url": "https://pokeapi.co/api/v2/pokemon/10/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png" },
            { "name": "metapod", 
                "url": "https://pokeapi.co/api/v2/pokemon/11/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png" }, 
            { "name": "butterfree", 
                "url": "https://pokeapi.co/api/v2/pokemon/12/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png" }, 
            { "name": "weedle", 
                "url": "https://pokeapi.co/api/v2/pokemon/13/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png" }, 
            { "name": "kakuna",
                "url": "https://pokeapi.co/api/v2/pokemon/14/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png" }, 
            { "name": "beedrill", 
                "url": "https://pokeapi.co/api/v2/pokemon/15/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png" },
            { "name": "pidgey", 
                "url": "https://pokeapi.co/api/v2/pokemon/16/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png" },
            { "name": "pidgeotto", 
                "url": "https://pokeapi.co/api/v2/pokemon/17/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png" },
            { "name": "pidgeot", 
                "url": "https://pokeapi.co/api/v2/pokemon/18/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png" }, 
            { "name": "rattata", 
                "url": "https://pokeapi.co/api/v2/pokemon/19/", 
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png" },
            { "name": "raticate", 
                "url": "https://pokeapi.co/api/v2/pokemon/20/",
                "defaultSprite": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png" } 
                
            ] }
            
            
            
        """.trimIndent()


}