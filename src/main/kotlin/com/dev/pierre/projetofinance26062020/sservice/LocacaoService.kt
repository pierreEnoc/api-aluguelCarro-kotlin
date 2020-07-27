package com.dev.pierre.projetofinance26062020.sservice

import com.dev.pierre.projetofinance26062020.model.Locacao
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface LocacaoService {
    fun create(locacao: Locacao)
    fun findById(id: Int): Locacao?
    fun findAll(pageable: Pageable): Page<Locacao?>
    fun update(id: Int, locacao: Locacao)
    fun delete(id: Int)
}