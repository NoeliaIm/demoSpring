package com.bolsadeideas.springboot.backend.apirest.demo.models.dao;

import com.bolsadeideas.springboot.backend.apirest.demo.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
