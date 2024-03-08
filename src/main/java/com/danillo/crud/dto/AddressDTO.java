package com.danillo.crud.dto;

import com.danillo.crud.entity.Address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AddressDTO {
    private Long id;

    @NotBlank(message = "Campo não informado")
    private String street;

    @NotNull(message = "Campo não informado")
    private Integer number;

    @NotBlank(message = "Campo não informado")
    private String district;

    @NotBlank(message = "Campo não informado")
    private String city;

    @NotBlank(message = "Campo não informado")
    private String state;

    public AddressDTO(){

    }

    public AddressDTO(Address data){
        id = data.getId();
        street = data.getStreet();
        number = data.getNumber();
        district = data.getDistrict();
        city = data.getCity();
        state = data.getState();
    }
}
