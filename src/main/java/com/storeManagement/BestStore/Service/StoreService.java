package com.storeManagement.BestStore.Service;

import java.util.List;

import com.storeManagement.BestStore.Entity.Product;

public interface StoreService {

    public Product saveProduct(Product product);
	
	
	public List<Product> getAllProducts();
	
	
	public Product getProductById(int id);
	
	
	public boolean deleteProduct(int id);

	public Product updateProduct(int id, Product product);
    
} 
