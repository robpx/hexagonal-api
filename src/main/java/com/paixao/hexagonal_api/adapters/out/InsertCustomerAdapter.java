package com.paixao.hexagonal_api.adapters.out;

import com.paixao.hexagonal_api.adapters.out.repository.CustomerRepository;
import com.paixao.hexagonal_api.adapters.out.repository.mapper.CustomerEntityMapper;
import com.paixao.hexagonal_api.application.core.domain.Customer;
import com.paixao.hexagonal_api.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
