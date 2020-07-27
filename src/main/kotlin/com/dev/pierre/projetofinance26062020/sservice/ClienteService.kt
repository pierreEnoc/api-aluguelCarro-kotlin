package com.dev.pierre.projetofinance26062020.sservice

import com.dev.pierre.projetofinance26062020.model.Cliente
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface ClienteService {
    fun craete(cliente : Cliente)
    fun findById(id: Int) : Cliente?
    fun delete(id: Int)
    fun update(id: Int, cliente: Cliente)
    fun findAllCli(pageable: Pageable) : Page<Cliente?>
}