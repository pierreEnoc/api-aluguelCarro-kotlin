package com.dev.pierre.projetofinance26062020.model

import javax.persistence.*

@Entity
data class Fornecedo (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id")
        val id: Int,
        val nome: String,
        val descripcao: String
)