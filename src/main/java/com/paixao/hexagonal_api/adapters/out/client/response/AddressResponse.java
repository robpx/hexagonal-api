package com.paixao.hexagonal_api.adapters.out.client.response;

import lombok.Data;

@Data
public class AddressResponse {

    private String street;

    private String city;

    private String state;
}
