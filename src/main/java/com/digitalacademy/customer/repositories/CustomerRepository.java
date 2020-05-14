package com.digitalacademy.customer.repositories;

import com.digitalacademy.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //------------update----------//


    List<Customer> findByFirstName(String name) ;
    Customer findAllById(Long id);


}
