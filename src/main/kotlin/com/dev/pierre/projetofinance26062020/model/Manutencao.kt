package com.dev.pierre.projetofinance26062020.model

import java.util.*
import javax.persistence.*

@Entity
data class Manutencao (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id")
        val id: Int,
        val valorManutencao: Double,
        val dataManutencao: Date,

         @ManyToOne
         @JoinColumn(name = "id_veiculo")
         val veiculo: Veiculo
)