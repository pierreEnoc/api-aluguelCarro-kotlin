package com.dev.pierre.projetofinance26062020.model

import javax.persistence.*

@Entity
data class Modelo (
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="modelo_cod")
        val medeloCod : Long,
        val Descricao: String
)