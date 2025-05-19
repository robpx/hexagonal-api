package com.paixao.hexagonal_api.adapters.out.client.mapper;

import com.paixao.hexagonal_api.adapters.out.client.response.AddressResponse;
import com.paixao.hexagonal_api.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
