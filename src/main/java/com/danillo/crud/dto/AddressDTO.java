package com.danillo.crud.dto;

import com.danillo.crud.entity.Address;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@NoArgsConstructor
@Getter
public class AddressDTO {
    private Long id;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Length(min=2, max=30, message = "Quantidade de caracteres inválida")
    private String street;

    @NotNull(message = "Campo não informado")
    @Min(value = 1, message = "O número mínimo permitido é 1")
    @Max(value = 9999, message = "O número máximo permitido é 9999")
    private Integer number;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Length(min=2, max=30, message = "Quantidade de caracteres inválida")
    private String district;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Length(min=2, max=30, message = "Quantidade de caracteres inválida")
    private String city;

    @NotNull(message = "Campo não informado")
    @NotBlank(message = "Campo não informado")
    @Length(min=2, max=30, message = "Quantidade de caracteres inválida")
    private String state;

    public AddressDTO(Address data){
        id = data.getId();
        street = data.getStreet();
        number = data.getNumber();
        district = data.getDistrict();
        city = data.getCity();
        state = data.getState();
    }

    public static List<AddressDTO> toDto(List<Address> address){
        return address.stream()
                .map(x -> new AddressDTO(x))
                .toList();
    }
}
