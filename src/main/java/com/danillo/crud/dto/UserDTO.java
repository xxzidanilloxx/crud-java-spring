package com.danillo.crud.dto;

import com.danillo.crud.entity.Address;
import com.danillo.crud.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class UserDTO {
    private Long id;

    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-Z][a-z]*$",
            message = "Informe o primeiro nome com a primeira letra maiúscula e sem espaços")
    private String firstName;

    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-Z][a-z]*$",
            message = "Informe o sobrenome com a primeira letra maiúscula e sem espaços")
    private String lastName;

    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "\\d{11}", message = "Digite um CPF válido")
    private String cpf;

    @NotBlank(message = "Campo não informado")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private String birthDate;

    @NotBlank(message = "Campo não informado")
    @Email(message = "Digite um email válido", regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    private String email;

    private List<Address> addressList;

    public UserDTO(){

    }

    public UserDTO(User data){
        id = data.getId();
        firstName = data.getFirstName();
        lastName = data.getLastName();
        cpf = data.getCpf();
        birthDate = data.getBirthDate();
        email = data.getEmail();
        addressList = data.getAddressList();
    }
}
