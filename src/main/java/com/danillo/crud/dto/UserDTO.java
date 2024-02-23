package com.danillo.crud.dto;

import com.danillo.crud.model.User;
import jakarta.validation.constraints.*;
import lombok.Getter;

@Getter
public class UserDTO {
    private Long id;

    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-Z][a-z]*$",
            message = "Informe o seu primeiro nome com a primeira letra maiúscula e sem espaços")
    private String name;

    @NotNull(message = "Campo não informado")
    @Pattern(regexp = "\\d{11}", message = "Digite um CPF válido")
    private String cpf;

    @NotBlank(message = "Campo não informado")
    @Email(message = "Digite um email válido", regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
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
