package com.dev.pierre.projetofinance26062020.sservice.impl

import com.dev.pierre.projetofinance26062020.model.Locacao
import com.dev.pierre.projetofinance26062020.repository.LocacaoRepository
import com.dev.pierre.projetofinance26062020.sservice.LocacaoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class LocacaoServiceImpl(private val locacaoRepository: LocacaoRepository) : LocacaoService {
    override fun create(locacao: Locacao) {
        locacaoRepository.save(locacao)
    }
    
    override fun findById(id: Int): Locacao? {
      return  locacaoRepository.findById(id).orElse(null)
      
    }
    
    override fun findAll(pageable: Pageable): Page<Locacao?> {
      return  locacaoRepository.findAll(pageable)
    }
    
    override fun update(id: Int, locacao: Locacao) {
        create(locacao)
    }
    
    override fun delete(id: Int) {
        locacaoRepository.deleteById(id)
    }
}