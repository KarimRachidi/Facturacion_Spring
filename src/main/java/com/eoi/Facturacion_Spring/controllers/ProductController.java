package com.eoi.Facturacion_Spring.controllers;

import com.eoi.Facturacion_Spring.entities.Product;
import com.eoi.Facturacion_Spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//Request - cualquier tipo de request es bueno (get/post/put/delete)
@RequestMapping("/product") //Al ponerlo antes de la case, cualquier metodo que tenga esta , va a tener este prefijo.
public class ProductController {
    @Autowired
    //No necesitamos crear una instancia de ProductService porque ya está inyectada en el constructor
    private ProductService productService; //Inyeccion de dependencias, se crea una instancia de ProductService automáticamente y se usa cuando se necesite.

    @GetMapping("/") //Cuando se haga una petición GET a /products/ se ejecuta este método (showProduct
    //Model es el objeto que se le pasa a la vista para que sepa que tiene que mostrar en la pantalla.
    public String showProduct(Model model) {
        //Creamos atributo "products" que contiene todos los productos mediante el método findAll() de ProductService
        model.addAttribute("products", productService.findAll());
        //Devuelve el nombre de la vista que queremos mostrar (product-list.html)
        //El combo de Springboot se encarga de buscar la vista en la carpeta templates y añadirle la extensión .html
        return "product-list";
    }

    @GetMapping("/new") //Cuando se haga una petición GET a /products/new se ejecuta este método
    public String showNewProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "product-form";
        //Te devuelve el formulario para crear un nuevo producto (product-form.html) y lo guardas en el modelo de base de datos..
    }

    @PostMapping("/save") // Haces una petición POST a /products/save
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/product/";
        //
    }

    @GetMapping("/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteById(id);
        return "redirect:/product/";
    }
}
