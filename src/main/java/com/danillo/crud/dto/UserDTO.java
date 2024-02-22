package com.danillo.crud.dto;

import com.danillo.crud.model.User;
import lombok.Getter;

@Getter
public class UserDTO {
    private Long id;
    private String name;
    private Long cpf;
    private String email;

    public UserDTO(){

    }

    public UserDTO(User data){
        id = data.getId();
        name = data.getName();
        cpf = data.getCpf();
        email = data.getEmail();
    }
}
