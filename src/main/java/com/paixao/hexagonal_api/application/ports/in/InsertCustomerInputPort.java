package com.paixao.hexagonal_api.application.ports.in;

import com.paixao.hexagonal_api.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
