package com.products.products.Web;

import com.products.products.Model.Product;
import com.products.products.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<Product> createNewProduct(@RequestBody Product product) {
        Product product1 = productService.saveProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping("/findProducts")
    public List<Product> findProduct() {
        List<Product> returnList = productService.getAllProducts();
        Collections.reverse(returnList);
        return returnList;
    }

    @GetMapping("/findProductByName/{productName}")
    public Product findProductByProductName(@PathVariable String productName) {
        return productService.getProductByName(productName);
    }

}
