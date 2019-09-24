package com.nsbm.api.domain;

import javax.persistence.*;

@Entity
@Table(name = "product")


public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product")

    private String name;
    private String productCode;
    private String description;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isValid() {
        if (this.productCode!=null&& this.productCode.startsWith("PRD")){
            return true;
    }else
        return false;
    }
}
