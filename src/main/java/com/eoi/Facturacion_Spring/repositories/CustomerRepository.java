package com.eoi.Facturacion_Spring.repositories;

import com.eoi.Facturacion_Spring.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {


}