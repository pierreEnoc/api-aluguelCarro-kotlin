package com.dev.pierre.projetofinance26062020.repository

import com.dev.pierre.projetofinance26062020.model.Cliente
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository : PagingAndSortingRepository<Cliente, Long> {

}