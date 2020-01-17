package com.deloitte.deloitte.spring.boot.controller;

import java.util.List;
import com.deloitte.deloitte.spring.boot.model.*;
import com.deloitte.deloitte.spring.boot.service.ProductService;
import com.deloitte.deloittespringboot.util.ProductNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
      
	@Autowired
	ProductService service;
	@PostMapping("/products")
	
	public ResponseEntity<Product> saveProduct(@RequestBody Product product)
	{   
		ResponseEntity<Product> productResponse= new ResponseEntity<>
		(service.saveProduct(product),HttpStatus.CREATED);
		return productResponse;
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	
	}
	

	@GetMapping("/products/{pId}")
	public Product getProductById(@PathVariable ("pId")int pId)
	{
		return service.getProduct(pId);
	}
	
	@GetMapping("/products/{pName}")
	public Product getProductByName(@PathVariable ("pName")String pName)
	{
		return service.getProductByName(pName);
	}
	
	@GetMapping("/products/name/{pName}/price/{price}")
	public Product getProductByNameAndPrice(@PathVariable ("pName") String pName ,
	@PathVariable("price") float price)
	{
		return service.getProductByNameAndPrice(pName,price);
	}
			
//	@GetMapping("/products/price/range/from/{from}/to/{to}")
//	public List<Product> getProductsInRange(@PathVariable ("from") float from,
//	@PathVariable("to") float to)
//	{
//		return service.getProductsInRange();
//	}
	
	@DeleteMapping("/products/{pId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable int pId)
	{   
		ResponseEntity<Product> deletedProduct;
	
		if(!service.checkIfExists(pId)) {
			throw new ProductNotFoundException("pId: "+pId);
		}
		service.deleteProductById(pId);
		deletedProduct= new ResponseEntity<Product>(HttpStatus.OK);
		return deletedProduct;
		
		
		
		
	}
	
	
	
}
