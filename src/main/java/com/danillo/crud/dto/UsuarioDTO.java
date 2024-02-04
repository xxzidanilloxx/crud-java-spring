package com.danillo.crud.dto;

import com.danillo.crud.model.Usuario;
import lombok.Getter;

@Getter
public class UsuarioDTO {
    private Long id;
    private String nome;
    private Long cpf;
    private String email;

    public UsuarioDTO(){

    }

    public UsuarioDTO(Usuario dados){
        id = dados.getId();
        nome = dados.getNome();
        cpf = dados.getCpf();
        email = dados.getEmail();
    }
}
