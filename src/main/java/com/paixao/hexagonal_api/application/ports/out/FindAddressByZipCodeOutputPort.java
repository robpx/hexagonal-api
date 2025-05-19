package com.paixao.hexagonal_api.application.ports.out;

import com.paixao.hexagonal_api.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
