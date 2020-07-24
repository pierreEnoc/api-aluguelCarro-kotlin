package com.dev.pierre.projetofinance26062020.controller

import com.dev.pierre.projetofinance26062020.model.Cliente
import com.dev.pierre.projetofinance26062020.sservice.ClienteService
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/clientes")
class ClienteController(val clienteService: ClienteService) {
    
    @PostMapping()
    fun salaver(@RequestBody cliente: Cliente){
        clienteService.craete(cliente)
    }
    
    @GetMapping("{id}")
    fun getById(@PathVariable id: Long) : Cliente? {
        return clienteService.getById(id)
    }
    
    @GetMapping
    fun findAll( pageable: Pageable) = clienteService.findAllCli(pageable)
    
    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody cliente: Cliente){
        clienteService.update(id, cliente)
    }
    
    @DeleteMapping("{id}")
    fun deleteCli(@PathVariable id: Long){
        clienteService.delete(id)
    }
}