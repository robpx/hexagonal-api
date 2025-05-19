package com.paixao.hexagonal_api.application.ports.out;

import com.paixao.hexagonal_api.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
