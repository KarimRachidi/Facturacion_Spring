package com.eoi.Facturacion_Spring.services;

import com.eoi.Facturacion_Spring.entities.Product;
import com.eoi.Facturacion_Spring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Es lo mismo que poner @Component pero para servicios
public class ProductService {
    @Autowired //Inyeccion de dependencias: accede al repositorio para guardar los objetos
    private ProductRepository productRepository;
    //Instancia el ProductRepository automáticamente y lo usa cuando se necesite

    //Implementación de métodos principales que se usan al entrar en el CRUD
    public List<Product> findAll() {
        return productRepository.findAll();
        //Es un SELECT.^FORM products y los mete en un objeto de tipo lista
    }

    //Objeto de tipo opcional que controla si un objeto existe o no y evitar los null pointer.
    // Null pointer: la direccion de memoria a la que se intenta acceder está vacía.
    // El puntero que apunta a esa dirreción no apunta nada, el valor es nulo y genera un error.

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
        //Devuelve un optional con el objeto que se busca o un optional vacío si no existe

    }

    public Optional<Product> findByName(String name){

        return null;
    }
    public Product save(Product product) {
        return productRepository.save(product);
    }
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

}
