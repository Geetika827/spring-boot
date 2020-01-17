package com.deloitte.deloitte.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.deloitte.deloitte.spring.boot.model.Product;
import com.deloitte.deloitte.spring.boot.repo.*;

@Service
public class ProductService {
       @Autowired
       ProductRepo repo;
       public Product saveProduct(Product product)
       {
    	   return repo.save(product);
    	  
       }
       public List<Product> getAllProducts()
       {
    	   return repo.findAll();
    	   
       }
       public Product getProduct(int pId)
       {
    	   return repo.getOne(pId);
       }
	
       public void deleteProductById(int pId)
       {
       repo.deleteById(pId);
       }
       
       public boolean checkIfExists(int pId)
       {
    	   return repo.existsById(pId);
       }
       public Product getProductByName(String pName)
       {
    	   return repo.findByproductName(pName);
       }
       public Product getProductByNameAndPrice(String pName,float price)
       {
    	   return repo.findByproductNameAndPrice(pName,price);
       }
//       
//       public Product getProductsInRange(float from, float to)
//       {
//    	   return repo.findProductsInRange();
//       }
}
