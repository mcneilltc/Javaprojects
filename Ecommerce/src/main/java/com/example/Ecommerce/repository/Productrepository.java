package com.example.Ecommerce.repository;

import com.example.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Productrepository extends CrudRepository<Product, Long> {
//     List<String> findDistinctCategories();
     Product findById(long id);
//     List<String> findDistinctBrands();
    List<Product> findAll();
    List<Product> findAllByBrand(String brand);
    List<Product>findAllByCategory(String category);
    List<Product>findAllByBrAndCategory(String brand, String category);

    @Query("SELECT DISTINCT  brand FROM Product")
    List<String> findDistinctBrands();

    @Query(" SELECT distinct category FROM Product")
    List<String> findDistinctCategories();

    List<Product> findAllByBrandAndCategory(String brand, String category);
}
