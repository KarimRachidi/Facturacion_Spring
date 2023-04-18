package com.eoi.Facturacion_Spring.controllers;


import com.eoi.Facturacion_Spring.entities.Invoice;
import com.eoi.Facturacion_Spring.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceRestController {

    @Autowired
    private InvoiceService invoiceService;
    @GetMapping
    public List<Invoice> findAll() {
        return invoiceService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Invoice> findById(@PathVariable Long id) {
        return invoiceService.findById(id);
    }
    @PostMapping
    public Invoice save(@RequestBody Invoice invoice) {
        return invoiceService.save(invoice);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        invoiceService.deleteById(id);
    }
}