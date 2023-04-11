package com.eoi.Facturacion_Spring.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Customer {
    @Id
    private Integer id;
    String nombre;

}
