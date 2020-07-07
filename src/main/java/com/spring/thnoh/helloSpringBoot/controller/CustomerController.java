package com.spring.thnoh.helloSpringBoot.controller;

import com.spring.thnoh.helloSpringBoot.model.Customer;
import com.spring.thnoh.helloSpringBoot.repo.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    static Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerRepository repository;

    @GetMapping(value = "/customers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> getAll(){

        logger.debug("Calling getAll()");

        List<Customer> list = new ArrayList<>();
        Iterable<Customer> customers = repository.findAll();

        customers.forEach(list::add);

        return new ResponseEntity<>(list, HttpStatus.OK);

    }

    @PostMapping(value="/customers")
    public ResponseEntity<Void> postCustomer(@RequestBody Customer customer){

        logger.debug("Calling postCustomer()");

        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();

        repository.save(new Customer(firstName,lastName));

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping(value = "/customers/{lastName}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> findByLastName(@PathVariable String lastName){

        logger.debug("Calling findByLastName()");

        List<Customer> customers = repository.findByLastName(lastName);

        return new ResponseEntity<>(customers,HttpStatus.OK);
    }

    @DeleteMapping(value = "/customers/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable long id){

        logger.debug("Calling deleteCustomer()");

        repository.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


}
