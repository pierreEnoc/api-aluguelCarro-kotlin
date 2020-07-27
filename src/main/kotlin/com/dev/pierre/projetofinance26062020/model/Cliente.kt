package com.dev.pierre.projetofinance26062020.model

import javax.persistence.*

@Entity
data class Cliente (
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id")
        val id: Int,
        val cpf: Long,
        val nome: String,
        val email: String,
        val telefone: String,
        val endereco: String,
        /*
        @ManyToOne
        @JoinColumn(name = "id_veiculo")
        val veiculo: Veiculo
         */
       
        //@JoinColumn(name = "id_veiculo")
        @OneToMany
        val veiculo: List<Veiculo>
)