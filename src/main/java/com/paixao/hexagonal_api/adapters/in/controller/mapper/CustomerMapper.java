package com.paixao.hexagonal_api.adapters.in.controller.mapper;

import com.paixao.hexagonal_api.adapters.in.controller.request.CustomerRequest;
import com.paixao.hexagonal_api.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
}
