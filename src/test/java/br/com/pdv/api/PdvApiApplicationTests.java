package br.com.pdv.api;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.pdv.api.enumerated.PerfilEnum;
import br.com.pdv.api.model.entity.Empresa;
import br.com.pdv.api.model.entity.Usuario;
import br.com.pdv.api.model.repository.EmpresaRepository;
import br.com.pdv.api.model.repository.UsuarioRepository;
import br.com.pdv.api.util.SenhaUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PdvApiApplicationTests {

    @Autowired
    private EmpresaRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    public void contextLoads() {
        Empresa empresa = new Empresa(null, "7bit", "82198127000121", new Date(), new Date());
        repository.save(empresa);
    }

    @Test
    public void incluirUsuario() {
        Usuario u = new Usuario(null, "claudemirramosferreira@gmail.com", "123456", PerfilEnum.ROLE_ADMIN);
        u.setSenha(SenhaUtils.gerarBCrypt(u.getSenha()));
        usuarioRepository.save(u);
    }

}
