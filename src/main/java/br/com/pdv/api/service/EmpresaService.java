package br.com.pdv.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pdv.api.model.entity.Empresa;
import br.com.pdv.api.model.repository.EmpresaRepository;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public List<Empresa> findAll() {
        return repository.findAll();
    }

}
