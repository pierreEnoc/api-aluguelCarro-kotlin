package com.dev.pierre.projetofinance26062020.repository

import com.dev.pierre.projetofinance26062020.model.Veiculo
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface VeiculoRepository: PagingAndSortingRepository<Veiculo, Long> {
}