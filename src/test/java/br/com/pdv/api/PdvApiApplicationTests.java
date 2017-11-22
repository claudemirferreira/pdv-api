package br.com.pdv.api;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.pdv.api.model.entity.Empresa;
import br.com.pdv.api.model.repository.EmpresaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PdvApiApplicationTests {

    @Autowired
    private EmpresaRepository repository;

    @Test
    public void contextLoads() {
        Empresa empresa = new Empresa(null, "7bit", "82198127000121", new Date(), new Date());
        repository.save(empresa);
    }

}
