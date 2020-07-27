package com.dev.pierre.projetofinance26062020.controller

import com.dev.pierre.projetofinance26062020.model.Veiculo
import com.dev.pierre.projetofinance26062020.sservice.AutomovelService
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/automoveis")
class AutomovelController (val automovelService: AutomovelService) {
    
    @PostMapping()
    fun salvar(@RequestBody automovel: Veiculo): ResponseEntity <Unit> {
       automovelService.craete(automovel)
        return ResponseEntity(Unit, HttpStatus.CREATED)
    }
    
    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Veiculo>{
        var automovel  = automovelService.findById(id)
        var status = if (automovel == null) HttpStatus.NOT_FOUND else HttpStatus.OK
        return ResponseEntity(automovel, status)
    }
    
    @GetMapping
    fun findAll(pageable: Pageable) = automovelService.findAll(pageable)
    
    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody automovel: Veiculo): ResponseEntity<Unit> {
        var status = HttpStatus.NOT_FOUND
        if (automovelService.findById(id) != null){
            automovelService.update(id, automovel)
            status= HttpStatus.ACCEPTED
        }
        return ResponseEntity(Unit, status)
    }
    @DeleteMapping("{id}")
    fun deletar(@PathVariable id: Long): ResponseEntity<Unit> {
        var status = HttpStatus.NOT_FOUND
        if (automovelService.findById(id) != null){
            status = HttpStatus.OK
            automovelService.dele(id)
        }
        return ResponseEntity(Unit, status)
        
    }
    
}