package com.eoi.Facturacion_Spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "invoices")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Column(name = "id_Invoice")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "date")
    private Date date;



}
