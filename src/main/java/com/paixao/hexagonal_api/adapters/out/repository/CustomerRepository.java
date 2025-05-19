package com.paixao.hexagonal_api.adapters.out.repository;

import com.paixao.hexagonal_api.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
