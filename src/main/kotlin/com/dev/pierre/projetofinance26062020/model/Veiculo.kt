package com.dev.pierre.projetofinance26062020.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.hibernate.annotations.Type
import javax.persistence.*

@Entity
data class Veiculo (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id")
        val id: Int,
        val praca: String,
        val numPorta: Int,
        val kilometragem: Long,
        val renavan: Long,
        val chassi: String,
        val valorLocacao: Double,
        
        @ManyToOne
        @JoinColumn(name = "id_modelo")
        val modelo: Modelo,
        
          @ManyToOne
          @JoinColumn(name = "id_locacao")
          val locacao: Locacao,
        
         @OneToMany
         val manutencao: List<Manutencao>,
        
        //
        @ManyToOne
        @JoinColumn(name = "id_cores")
        val cores: Cores,
        
        @ManyToOne
        @JoinColumn(name = "id_cliente")
        val cliente: Cliente
       
        //val marcas: List<Marca> = mutableListOf() //athlet
)

/*
*
        @ManyToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
        @JoinTable(name = "automoveis",
             joinColumns = [JoinColumn(name = "automovel_", referencedColumnName = "automovel_id")],
        inverseJoinColumns = [JoinColumn(name = "marca_id", referencedColumnName = "marca_id")])
        @JsonIgnoreProperties("automovel")
        val marcas: List<Marca> = mutableListOf() //athlet
*
*
*
      Example:
  
      @JoinTable(
          name="CUST_PHONE",
          joinColumns=
              @JoinColumn(name="CUST_ID", referencedColumnName="ID"),
          inverseJoinColumns=
              @JoinColumn(name="PHONE_ID", referencedColumnName="ID")
      )
   
* */