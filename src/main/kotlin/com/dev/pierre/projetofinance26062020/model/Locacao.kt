package com.dev.pierre.projetofinance26062020.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "locacao")
data class Locacao (
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id:Long,
        val dataLocacao: Date,
        val horarioLocacao: TimeZone,
        val dataDevolucao: Date,
        val horarioDevolucao:TimeZone,
        val kilometragem:Long,
        val valorCarcao: Double,
        val valorLocacao: Double,
        val devolvido: Int
        )