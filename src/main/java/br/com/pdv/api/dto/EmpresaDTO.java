package br.com.pdv.api.dto;

import lombok.Getter;
import lombok.Setter;

public class EmpresaDTO {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String razaoSocial;

    @Getter
    @Setter
    private String cnpj;

    public EmpresaDTO(Long id, String razaoSocial, String cnpj) {
        super();
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
}