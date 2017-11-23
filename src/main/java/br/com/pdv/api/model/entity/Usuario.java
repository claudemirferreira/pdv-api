package br.com.pdv.api.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.pdv.api.enumerated.PerfilEnum;
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
    @Column(name = "email", nullable = false)
    private String email;

    @Getter
    @Setter
    @Column(name = "senha", nullable = false)
    private String senha;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "perfil", nullable = false)
    private PerfilEnum perfil;

    public Usuario(Long id, String email, String senha, PerfilEnum perfil) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

}
