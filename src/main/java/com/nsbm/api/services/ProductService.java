package com.nsbm.api.services;

import com.nsbm.api.domain.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {

    public Product createProduct(@RequestBody Product product) throws IllegalAccessException{
        System.out.println("name:"+product.getName());

        //todo save in db but for now a dummy
        if(product== null || !product.isValid()){
            throw new IllegalAccessException(
                    "product is not valid");
        }
//        Product savedProduct = ProductRepository.ProductRepositary.save(product);
        return product;
    }

}
