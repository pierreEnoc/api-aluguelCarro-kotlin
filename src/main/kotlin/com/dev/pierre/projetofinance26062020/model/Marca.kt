package com.dev.pierre.projetofinance26062020.model

import javax.persistence.*

@Entity
data class Marca (
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="marca_cod")
        val marcaCod: Long,
        val descricao : String
)