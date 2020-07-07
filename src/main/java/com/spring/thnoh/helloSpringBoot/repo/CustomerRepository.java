package com.spring.thnoh.helloSpringBoot.repo;

import com.spring.thnoh.helloSpringBoot.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByLastName(String lastName);

}
