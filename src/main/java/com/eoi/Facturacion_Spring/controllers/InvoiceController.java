package com.eoi.Facturacion_Spring.controllers;


import com.eoi.Facturacion_Spring.entities.Customer;
import com.eoi.Facturacion_Spring.entities.Invoice;
import com.eoi.Facturacion_Spring.services.CustomerService;
import com.eoi.Facturacion_Spring.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/invoices")//url
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    private CustomerService customerService;
    //Para acceder a los métodos

    @GetMapping(value = {"/",""})
    //Model es el objeto que utiliza Spring para pasar al html los datos de la BD
    public String showInvoices(Model model){
        //
        model.addAttribute("invoices",invoiceService.findAll());
        //Devuelve el HTML
        return "invoice-list";
    }
    @GetMapping("/new")
    public String showNewInvoiceForm(Model model) {
        model.addAttribute("invoice", new Invoice());
        return "invoice-form";
    }
    @PostMapping("/save")
    public String saveInvoice(@ModelAttribute("invoice") Invoice invoice) {
        invoiceService.save(invoice);
        return "redirect:/invoices/";
    }
    @GetMapping("/edit/{id}")
    public String showEditInvoiceForm(@PathVariable Long id, Model model) {
        Customer customer = customerService.getCustomersById(id);
        model.addAttribute("customer", customer);
        model.addAttribute("allInvoices", invoiceService.getAllInvoices());
        return "invoice-form";
    }
    @GetMapping("/delete/{id}")
    public String deleteInvoice(@PathVariable("id") Long id) {
        invoiceService.deleteById(id);
        return "redirect:/invoices/";
    }

}