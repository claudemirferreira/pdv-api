package br.com.pdv.api.util;

import java.io.Serializable;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils implements Serializable {

    private static final long serialVersionUID = -8063926106831099223L;
    
    //String senhaEncoded = SenhaUtils.gerarBCrypt("123456"); 
    //boolean senhaValida = SenhaUtils.senhaValida("123456", senhaEncoded);

    public static String gerarBCrypt(String senha) {
        if (senha == null) {
            return senha;
        }
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.encode(senha);
    }

    public static boolean senhaValida(String senha, String senhaEncoded) {
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();

        return bCryptEncoder.matches(senha, senhaEncoded);
    }

}