package com.vinod.springboot.liquibase.service;

import com.vinod.springboot.liquibase.model.Customer;

public interface ICustomerService {

    /**
     * Add new customer.
     *
     * @param customer  - Customer object.
     * @return          - Persisted customer object.
     */
    Customer addCustomer(Customer customer);

    /**
     * Get new customer object.
     *
     * @param id    - Customer ID.
     * @return      - Customer object.
     */
    Customer getCustomerById(Long id);
}
