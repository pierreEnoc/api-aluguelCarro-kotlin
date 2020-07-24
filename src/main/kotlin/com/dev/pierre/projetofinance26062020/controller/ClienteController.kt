package com.dev.pierre.projetofinance26062020.controller

import com.dev.pierre.projetofinance26062020.model.Cliente
import com.dev.pierre.projetofinance26062020.sservice.ClienteService
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/clientes")
class ClienteController(val clienteService: ClienteService) {
    
    @PostMapping()
    fun salaver(@RequestBody cliente: Cliente): ResponseEntity<Unit> {
        clienteService.craete(cliente)
        return ResponseEntity(Unit,HttpStatus.CREATED)
    }
    
    @GetMapping("{id}")
    fun getById(@PathVariable id: Long) : ResponseEntity<Cliente?> {
        var cliente = clienteService.getById(id)
        var status = if (cliente == null) HttpStatus.NOT_FOUND else HttpStatus.OK
        return ResponseEntity(cliente, status)
    }
    @GetMapping
    fun getAllCliente( pageable: Pageable) =  clienteService.findAllCli(pageable)
   /*
    @GetMapping
    fun findAll( pageable: Pageable) : ResponseEntity<Pageable> {
        var status = HttpStatus.OK
        val listCliente = clienteService.findAllCli(pageable)
        if (clienteService.findAllCli(pageable).size == 0){
            status = HttpStatus.NOT_FOUND
        }
        return ResponseEntity(pageable, status)
    }
    */
    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody cliente: Cliente){
        clienteService.update(id, cliente)
    }
    
    @DeleteMapping("{id}")
    fun deleteCli(@PathVariable id: Long){
        clienteService.delete(id)
    }
}