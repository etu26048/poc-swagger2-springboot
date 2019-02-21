package ec.ep.pocswagger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ec.ep.pocswagger.model.Product;

@Service
public class ProductService {
	
	public List<Product> listAllProducts() {
		List<Product> products = new ArrayList<>();
		return products;
	}
	
	public Product getProductById(Integer id) {
		return new Product();
	}
	
	public void saveProduct(Product product) {
		
	}
	
	public void deleteProduct(Integer id) {
		
	}
}
