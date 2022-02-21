package com.melaku.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.melaku.Product.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	Product findByProductId(Long productId);
	
}
