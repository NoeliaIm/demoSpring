package com.bolsadeideas.springboot.backend.apirest.demo.models.services;

        import com.bolsadeideas.springboot.backend.apirest.demo.models.entity.Cliente;

        import java.util.List;

public interface IClienteService {
    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save (Cliente cliente);
    void delete(Long id);
}
