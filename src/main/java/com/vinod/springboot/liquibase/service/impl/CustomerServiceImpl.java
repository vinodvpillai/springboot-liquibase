package com.vinod.springboot.liquibase.service.impl;

import com.vinod.springboot.liquibase.model.Customer;
import com.vinod.springboot.liquibase.repository.CustomerRepository;
import com.vinod.springboot.liquibase.service.ICustomerService;
import jdk.nashorn.internal.runtime.options.Option;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        log.trace("Request came to add new customer : {}",customer);
        Customer persistedCustomer=customerRepository.save(customer);
        log.trace("Successfully saved customer object and persisted object: {}",persistedCustomer);
        return persistedCustomer;
    }

    @Override
    public Customer getCustomerById(Long id) {
        log.trace("Request came to fetch the customer having customer id : {}",id);
        Optional<Customer> optionalCustomer=customerRepository.findById(id);
        if(optionalCustomer.isPresent()){
            Customer customer=optionalCustomer.get();
            log.trace("Successfully fetched customer object : {} having customer id: {}",customer);
            return customer;
        }
        return null;
    }
}
