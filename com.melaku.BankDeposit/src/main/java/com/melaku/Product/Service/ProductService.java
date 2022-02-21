package com.melaku.Product.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melaku.Product.Model.Product;
import com.melaku.Product.Repository.ProductRepository;

@Service
public class ProductService {
    
	@Autowired
	ProductRepository prodrepo;
	public Product saveProduct(Product product) {
		return prodrepo.save(product);		
	}
	
	public Product findProductById(Long productId) {
		
		return prodrepo.findByProductId(productId);
	}

	
	}


