package com.dev.pierre.projetofinance26062020.controller

import com.dev.pierre.projetofinance26062020.model.Locacao
import com.dev.pierre.projetofinance26062020.sservice.LocacaoService
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/locacoes")
class LocacaoController(val locacaoService: LocacaoService) {
    
    @PostMapping
    fun salvar(@RequestBody locacao: Locacao): ResponseEntity<Unit> {
        locacaoService.create(locacao)
        return ResponseEntity(Unit, HttpStatus.CREATED)
    }
    
    @GetMapping("{id}")
    fun findById(@PathVariable id: Int): ResponseEntity<Locacao> {
        var locacao = locacaoService.findById(id)
        var status = if (locacao == null) HttpStatus.NOT_FOUND else HttpStatus.OK
        return ResponseEntity(locacao, status)
    }
    
    @GetMapping
    fun findAll(pageable: Pageable) = locacaoService.findAll(pageable)
    
    
    @PutMapping("{id}")
    fun update(@PathVariable id: Int, @RequestBody locacao: Locacao): ResponseEntity<Unit> {
        var status = HttpStatus.NOT_FOUND
        if (locacaoService.findById(id) != null){
            locacaoService.update(id, locacao)
            status = HttpStatus.OK
        }
        return ResponseEntity(Unit, status)
    }
    
    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Int): ResponseEntity<Unit> {
        var status = HttpStatus.NOT_FOUND
        if (locacaoService.findById(id) != null){
            status = HttpStatus.OK
            locacaoService.delete(id)
        }
        return  ResponseEntity(Unit, status)
    }
}