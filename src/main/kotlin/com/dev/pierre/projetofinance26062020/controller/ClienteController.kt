package com.dev.pierre.projetofinance26062020.controller

import com.dev.pierre.projetofinance26062020.model.Cliente
import com.dev.pierre.projetofinance26062020.sservice.ClienteService
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/clientes")
class ClienteController(val clienteService: ClienteService) {
    
    @PostMapping()
    fun salvar(@RequestBody cliente: Cliente): ResponseEntity<Unit> {
        clienteService.craete(cliente)
        return ResponseEntity(Unit,HttpStatus.CREATED)
    }
    @GetMapping("{id}")
    fun findById(@PathVariable id: Int) : ResponseEntity<Cliente?> {
        var cliente = clienteService.findById(id)
        var status = if (cliente == null) HttpStatus.NOT_FOUND else HttpStatus.OK
        return ResponseEntity(cliente, status)
    }
    @GetMapping
    fun findAll(pageable: Pageable) =  clienteService.findAllCli(pageable)
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
    fun update(@PathVariable Int: Int, @RequestBody cliente: Cliente): ResponseEntity<Unit>{
       var status = HttpStatus.NOT_FOUND
       if (clienteService.findById(Int) != null){
           clienteService.update(Int, cliente)
           status = HttpStatus.OK
       }
       return ResponseEntity(Unit, status)
    }
    
    @DeleteMapping("{id}")
    fun deleteCli(@PathVariable id: Int): ResponseEntity<Unit>{
        var status = HttpStatus.NOT_FOUND
        if (clienteService.findById(id) != null) {
            status = HttpStatus.OK
            clienteService.delete(id)
        }
       return  ResponseEntity(Unit, status)
    }
}