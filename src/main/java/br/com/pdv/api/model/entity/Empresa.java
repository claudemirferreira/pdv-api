package br.com.pdv.api.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table
@Entity(name = "pdv_empresa")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 962458203055121591L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
    @SequenceGenerator(sequenceName = "empresa_seq", allocationSize = 1, name = "emp_seq")
    @Column(name = "empresa_id")
    @Setter
    @Getter
    private Long id;
    @Getter
    @Setter
    private String razaoSocial;
    @Getter
    @Setter
    private String cnpj;
    @Getter
    @Setter
    private Date dataCriacao;
    @Getter
    @Setter
    private Date dataAtualizacao;

    public Empresa(Long id, String razaoSocial, String cnpj, Date dataCriacao, Date dataAtualizacao) {
        super();
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
    }

    @PreUpdate
    public void preUpdate() {
        dataAtualizacao = new Date();
    }

    @PrePersist
    public void prePersist() {
        final Date atual = new Date();
        dataCriacao = atual;
        dataAtualizacao = atual;
    }

    @Override
    public String toString() {
        return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataCriacao=" + dataCriacao + ", dataAtualizacao=" + dataAtualizacao + "]";
    }
}