package com.dev.pierre.projetofinance26062020.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Cliente (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val cpf: Long,
        val nome: String,
        val email: String,
        val telefone: String,
        val endereco: String
)