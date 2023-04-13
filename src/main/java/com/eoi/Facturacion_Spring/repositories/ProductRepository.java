package com.eoi.Facturacion_Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eoi.Facturacion_Spring.entities.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //Creamos el metodo aqui para que funcione en el ProductService
    //El JpaRepository ya tiene los metodos basicos de CRUD - implementamos el método findByName
    //JPA nos permite asumir que al crear este metodo vamos a crear una QUERY para bbuscar algo por el nombre en la BD

    Optional<Product> findByName(String name);
}