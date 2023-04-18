package com.eoi.Facturacion_Spring.repositories;

import com.eoi.Facturacion_Spring.entities.Phone;
import com.eoi.Facturacion_Spring.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
