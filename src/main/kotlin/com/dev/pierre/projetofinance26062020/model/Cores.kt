package com.dev.pierre.projetofinance26062020.model

import javax.persistence.*

@Entity
data class Cores (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id")
        val id: Int,
        val nome: String,
        
         @OneToMany
         @JoinColumn(name = "id_cores")
         val cores: List<Veiculo>
)