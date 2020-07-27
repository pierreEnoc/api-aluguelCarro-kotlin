package com.dev.pierre.projetofinance26062020.sservice

import com.dev.pierre.projetofinance26062020.model.Veiculo
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface AutomovelService {
    fun craete (automovel : Veiculo )
    fun findById(id: Long) : Veiculo?
    fun findAll(pageable: Pageable) : Page<Veiculo?>
    fun update(id: Long, automovel: Veiculo)
    fun dele(id: Long)
}