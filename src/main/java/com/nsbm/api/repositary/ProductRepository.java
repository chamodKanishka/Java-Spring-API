package com.nsbm.api.repositary;

import com.nsbm.api.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository {
    @Repository
    public interface ProductRepositary extends CrudRepository<Product, Integer>{

    }
}
