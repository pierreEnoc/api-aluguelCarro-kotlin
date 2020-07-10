package com.dev.pierre.projetofinance26062020.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Automovel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val praca: String,
        val cor: String,
        val numPorta: Int,
        val kilometragem: Long,
        val renavan: Long,
        val chassi: String,
        val valorLocacao: Double
)