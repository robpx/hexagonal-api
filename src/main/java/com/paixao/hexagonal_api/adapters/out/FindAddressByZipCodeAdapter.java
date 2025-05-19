package com.paixao.hexagonal_api.adapters.out;

import com.paixao.hexagonal_api.adapters.out.client.FindAddressByZipCodeClient;
import com.paixao.hexagonal_api.adapters.out.client.mapper.AddressResponseMapper;
import com.paixao.hexagonal_api.application.core.domain.Address;
import com.paixao.hexagonal_api.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;


    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
