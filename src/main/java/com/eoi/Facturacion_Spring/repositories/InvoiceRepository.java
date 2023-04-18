package com.eoi.Facturacion_Spring.repositories;

import com.eoi.Facturacion_Spring.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {



}