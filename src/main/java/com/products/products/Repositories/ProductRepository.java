package com.products.products.Repositories;

import com.products.products.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository  extends CrudRepository<Product, Long> {

    Product findByProductName(String productName);

}
