package br.com.pdv.api.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table
@Entity(name = "saa_usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 3695403498233408706L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "saa_usuario_id_seq")
    @SequenceGenerator(sequenceName = "saa_usuario_seq", allocationSize = 1, name = "saa_usuario_id_seq")
    @Column(name = "usuario_id")
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String login;

    @Getter
    @Setter
    private String senha;

}
