package com.proyecto.app.dao;

import com.proyecto.app.model.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {
    public Cliente findByUsername(String username);
}
