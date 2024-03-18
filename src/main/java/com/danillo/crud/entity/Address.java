package com.danillo.crud.entity;

import com.danillo.crud.dto.AddressDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name="TB_ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    public Address(AddressDTO address){
        id = address.getId();
        street = address.getStreet();
        number = address.getNumber();
        district = address.getDistrict();
        city = address.getCity();
        state = address.getState();
    }

    public static List<Address> toEntity(List<AddressDTO> dtoList) {
        List<Address> addressList = new ArrayList<>();
        for (AddressDTO dto : dtoList) {
            Address address = new Address();
            address.setId(dto.getId());
            address.setStreet(dto.getStreet());
            address.setNumber(dto.getNumber());
            address.setDistrict(dto.getDistrict());
            address.setCity(dto.getCity());
            address.setState(dto.getState());
            addressList.add(address);
        }
        return addressList;
    }
}
