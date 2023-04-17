package com.eoi.Facturacion_Spring.services.invoice;

import com.eoi.Facturacion_Spring.entities.Invoice;
import com.eoi.Facturacion_Spring.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired //Inyección de dependencias - accede al repositorio para guardas los objetos
    private InvoiceRepository invoiceRepository;

    //Implementación de los métodos principales que se usan al entrar en el CRUD
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }
    public Optional<Invoice> findById(Long id) {
        return invoiceRepository.findById(id);
    }

    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
    public void deleteById(Long id) {
        invoiceRepository.deleteById(id);
    }
}