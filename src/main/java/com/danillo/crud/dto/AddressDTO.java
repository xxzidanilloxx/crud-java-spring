package com.danillo.crud.dto;

import com.danillo.crud.entity.Address;
import lombok.Getter;

@Getter
public class AddressDTO {

    private Long id;
    private String street;
    private Integer number;
    private String district;
    private String city;
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
