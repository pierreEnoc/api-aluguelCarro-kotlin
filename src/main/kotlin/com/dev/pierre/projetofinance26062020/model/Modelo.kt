package com.dev.pierre.projetofinance26062020.model

import javax.persistence.*

@Entity
data class Modelo (
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id")
        val id: Int,
        val nome: String,
        val Descricao: String,
        //
        @ManyToOne
        @JoinColumn(name = "id_marca")
        val marca: Marca,
        
        @ManyToOne
        val veiculo: Veiculo
)