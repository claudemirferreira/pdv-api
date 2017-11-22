package br.com.pdv.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pdv.api.dto.EmpresaDTO;
import br.com.pdv.api.model.entity.Empresa;
import br.com.pdv.api.service.EmpresaService;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @GetMapping(value = "/")
    public List<Empresa> exemplo(@PathVariable("nome") String nome) {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<EmpresaDTO> cadastrar(@RequestBody EmpresaDTO empresaDto) {
        empresaDto.setId(1L);
        return ResponseEntity.ok(empresaDto);
    }

}
