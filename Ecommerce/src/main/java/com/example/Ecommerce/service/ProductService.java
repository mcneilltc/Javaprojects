package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.Productrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    Productrepository productrepository;

    public ProductService(Productrepository productrepository) {
        this.productrepository= productrepository;
    }

    public List<String> findDistinctCategories() {
        return productrepository.findDistinctCategories() ;
    }

    public List<String> findDistinctBrands() {
        return productrepository.findDistinctBrands();
    }

    public List<Product> findByBrandAndOrCategory(String brand, String category) {
        List<Product> productList;
        if(brand==null && category==null){
            productList=productrepository.findAll();
        }else if(brand== null || brand.equals("")){
            productList= productrepository.findAllByCategory(category);
        }else if(category== null || category.equals("")){
            productList= productrepository.findAllByBrand(brand);
        } else{
            productList=productrepository.findAllByBrandAndCategory(brand, category);
        }return productList;
    }
public List<Product>findAll(){
        return productrepository.findAll();
}

    public Product findById(long id) {
   return productrepository.findById(id);
    }

    public void save(Product product) {
        productrepository.save(product);
    }
}
