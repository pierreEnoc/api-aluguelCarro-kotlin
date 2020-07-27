package com.dev.pierre.projetofinance26062020.repository

import com.dev.pierre.projetofinance26062020.model.Locacao
import org.springframework.data.repository.PagingAndSortingRepository

interface LocacaoRepository: PagingAndSortingRepository<Locacao, Int> {
}