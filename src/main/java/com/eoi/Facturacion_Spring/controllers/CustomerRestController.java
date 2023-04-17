package com.eoi.Facturacion_Spring.controllers;

import com.eoi.Facturacion_Spring.entities.Customer;
import com.eoi.Facturacion_Spring.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;
    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable Long id) {
        return customerService.findById(id);
    }
    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
    }
}