package com.dev.pierre.projetofinance26062020.model

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "locacao")
data class Locacao (
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="id")
        val id:Int,
        
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        //@Convert(converter = Jsr310JpaConverters.LocalDateConverter)
        val dataLocacao: Date,

        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone=" America/Sao_Paulo")
        val horarioLocacao: TimeZone,
        
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        val dataDevolucao: Date,

        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone=" America/Sao_Paulo")
        val horarioDevolucao:TimeZone,
        val kilometragem:Long,
        val valorCarcao: Double,
        val valorLocacao: Double,
        val devolvido: Int,
        
        @ManyToOne
        @JoinColumn(name = "id_veiculo")
        val veiculo: Veiculo
        
        //
       // @ManyToOne
       // @JoinColumn(name = "id_cliente")
      //  val cliente: Cliente

)