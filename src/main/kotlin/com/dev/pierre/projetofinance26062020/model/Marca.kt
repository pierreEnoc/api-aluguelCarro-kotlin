package com.dev.pierre.projetofinance26062020.model

import javax.persistence.*

@Entity
data class Marca (
       
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id")
        val id: Int,
        val nome: String,
        val descricao : String,
        
        @OneToMany
        val modelo: List<Modelo>
)