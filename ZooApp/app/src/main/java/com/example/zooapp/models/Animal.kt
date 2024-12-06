package com.example.zooapp.models

import com.example.zooapp.R


data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Aspas",
        species = "Homo Sapiens",
        imageRes = R.drawable.aspas,
        description = "O maior e o mais constante duelista da era moderna",
        curiosities = "Ama Toddynho"
    ),
    Animal(
        id = 2,
        name = "Less",
        species = "Homo Sapiens",
        imageRes = R.drawable.less,
        description = "O melhor sentinela de Valorant",
        curiosities = "Tem a mira mais calma do mundo"
    ),
    Animal(
        id = 3,
        name = "panCada",
        species = "Homo Sapiens",
        imageRes = R.drawable.pancada,
        description = "O melhor controlador do mundo de Valorant",
        curiosities = "Foi o MVP do champions 2022(apenas o melhor do mundo)"
    ),
    Animal(
        id = 4,
        name = "SaadHak",
        species = "Homo Sapiens",
        imageRes = R.drawable.saadhak,
        description = "O melhor IGL do mundo de Valorant, sendo ums dos mais inteligentes do jogo!",
        curiosities = "É chamado de pai por transmitir uma aura mais cuidadosa"
    ),
    Animal(
        id = 5,
        name = "Sacy",
        species = "Homo Sapiens",
        imageRes = R.drawable.sacy,
        description = "O melhor iniciador do mundo de Valorant, infelizmente está atualmente aposentado",
        curiosities = "É careca"
    ),
)

