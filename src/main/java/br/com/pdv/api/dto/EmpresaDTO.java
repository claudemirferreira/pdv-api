package br.com.pdv.api.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;

import lombok.Getter;
import lombok.Setter;

public class EmpresaDTO {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotEmpty(message = "Razão social não pode ser vazia.")
    @Length(min = 5, max = 200, message = "Razão social deve conter entre 5 e 200 caracteres.")
    private String razaoSocial;

    @Getter
    @Setter
    @NotEmpty(message = "CNPJ não pode ser vazio.")
    @CNPJ(message = "CNPJ inválido.")
    private String cnpj;

    public EmpresaDTO(Long id, String razaoSocial, String cnpj) {
        super();
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "EmpresaDto [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
    }

}