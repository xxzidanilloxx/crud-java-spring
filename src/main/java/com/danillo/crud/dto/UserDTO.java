package com.danillo.crud.dto;

import com.danillo.crud.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public class UserDTO {
    private Long id;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-ZÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]{1}[a-záàâãéèêíïóôõöúçñ]{1,}$",
            message = "Informe o primeiro nome com a primeira letra maiúscula e sem espaços")
    @Length(min=2, max=15, message = "Quantidade de caracteres inválida")
    private String firstName;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-ZÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]{1}[a-záàâãéèêíïóôõöúçñ]{1,}$",
            message = "Informe o sobrenome com a primeira letra maiúscula e sem espaços")
    @Length(min=2, max=15, message = "Quantidade de caracteres inválida")
    private String lastName;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "\\d{11}", message = "Digite um CPF válido")
    private String cpf;

    @NotNull(message = "Campo não informado")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Email(message = "Digite um email válido", regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    private String email;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^\\(\\d{2}\\) \\d{5}-\\d{4}$", message = "Número de telefone inválido")
    private String phoneNumber;

    @Valid
    @NotNull(message = "A lista de endereços não pode estar vazia")
    @NotEmpty(message = "A lista de endereços não pode estar vazia")
    private List<AddressDTO> addressList = new ArrayList<>();

    public UserDTO(User data){
        id = data.getId();
        firstName = data.getFirstName();
        lastName = data.getLastName();
        cpf = data.getCpf();
        birthDate = data.getBirthDate();
        email = data.getEmail();
        phoneNumber = data.getPhoneNumber();
        addressList = (AddressDTO.toDto(data.getAddressList()));
    }
}
