package com.paixao.hexagonal_api.adapters.out.repository.mapper;

import com.paixao.hexagonal_api.adapters.out.repository.entity.CustomerEntity;
import com.paixao.hexagonal_api.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
