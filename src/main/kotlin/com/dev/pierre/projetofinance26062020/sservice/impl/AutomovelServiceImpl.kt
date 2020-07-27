package com.dev.pierre.projetofinance26062020.sservice.impl

import com.dev.pierre.projetofinance26062020.model.Veiculo
import com.dev.pierre.projetofinance26062020.repository.VeiculoRepository
import com.dev.pierre.projetofinance26062020.sservice.AutomovelService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class AutomovelServiceImpl(val automovelRepository: VeiculoRepository): AutomovelService {
    override fun craete(automovel: Veiculo) {
        automovelRepository.save(automovel)
    }
    
    override fun findById(id: Long): Veiculo? {
       return automovelRepository.findById(id).orElse(null)
    }
    
    override fun findAll(pageable: Pageable): Page<Veiculo?> {
       return automovelRepository.findAll(pageable)
    }
    
    override fun update(id: Long, automovel: Veiculo) {
        craete(automovel)
    }
    
    override fun dele(id: Long) {
       automovelRepository.deleteById(id)
    }
    
}