package com.dev.pierre.projetofinance26062020.sservice.impl

import com.dev.pierre.projetofinance26062020.model.Cliente
import com.dev.pierre.projetofinance26062020.repository.ClienteRepository
import com.dev.pierre.projetofinance26062020.sservice.ClienteService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service


@Service
class ClienteServiceImpl(private val clienteRepository :  ClienteRepository) : ClienteService {
    override fun craete(cliente: Cliente) {
        clienteRepository.save(cliente)
    }
    
    override fun findById(id: Int): Cliente? = clienteRepository.findById(id).orElse(null)
    
    override fun delete(id: Int) {
        clienteRepository.deleteById(id)
    }
    
    override fun update(id: Int, cliente: Cliente) {
        craete(cliente)
    }
    
    override fun findAllCli(pageable: Pageable): Page<Cliente?> {
        return clienteRepository.findAll(pageable)
        
    }
}