package com.nsbm.api.controller;

import com.nsbm.api.domain.Product;
import com.nsbm.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;


@RestController
@RequestMapping(path = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseBody
    public Product createProduct(@RequestBody Product product) throws IllegalAccessError, IllegalAccessException {
        System.out.println("name:"+product.getProductCode());
        //todo save in Db
        return productService.createProduct(product);
    }
}

