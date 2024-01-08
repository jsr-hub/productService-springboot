package com.scaler.productservicedemo.controller;

import com.scaler.productservicedemo.models.Product;
import com.scaler.productservicedemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService =productService;
    }
    @GetMapping() // localhost:8080/products
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @PostMapping()
    public Product addNewProduct(@RequestBody Product product){
        Product p = new Product();
        p.setTitle("new product");
        return p;
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,  @RequestBody Product product){
        return new Product();
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id,  @RequestBody Product product){
        return new Product();
    }

    @DeleteMapping("/{id}")
    public  void deleteProduct(@PathVariable("id") Long id){

    }

}
