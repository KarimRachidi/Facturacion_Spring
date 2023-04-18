package com.eoi.Facturacion_Spring.repositories;

import com.eoi.Facturacion_Spring.entities.Contract;
import com.eoi.Facturacion_Spring.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}

