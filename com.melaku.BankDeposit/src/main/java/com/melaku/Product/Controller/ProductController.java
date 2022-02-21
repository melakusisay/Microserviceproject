package com.melaku.Product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melaku.Product.Model.Product;
import com.melaku.Product.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService prodservice;
	
	@PostMapping("/")
	  public Product saveProduct(@RequestBody Product product) {
		  
		   return prodservice.saveProduct(product);
	  }
	   @GetMapping("/{id}")
	   public Product findProductById(@PathVariable("id") Long productId) {
			  
		   return prodservice.findProductById(productId);
	  }
}
