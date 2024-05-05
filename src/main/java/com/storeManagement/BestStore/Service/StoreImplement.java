package com.storeManagement.BestStore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeManagement.BestStore.Entity.Product;
import com.storeManagement.BestStore.Repository.StoreRepo;

@Service
public class StoreImplement implements StoreService{


    @Autowired
    private StoreRepo repo;

    @Override
    public Product saveProduct(Product product) {
       

        return repo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {


        return repo.findAll();
    }

    @Override
    public Product getProductById(int id) {

        Product product = repo.findById(id).get();
		
		return product;
    }

    @Override
    public boolean deleteProduct(int id) {
        Product product=repo.findById(id).get();
	
	if(product!=null) {
		
		repo.deleteById(id);
		return true;
	}
		
	return false;
    }

    @Override
    public Product updateProduct(int id, Product product) {

        Optional<Product> prevProduct=repo.findById(id);

        Product existProduct = prevProduct.get();

        if(prevProduct.isPresent()){
           
            existProduct.setProductName(product.getProductName());
            existProduct.setBrand(product.getBrand());
            existProduct.setCategory(product.getCategory());
            existProduct.setPrice(product.getPrice());
            existProduct.setStocks(product.getStocks());

        }

        return repo.save(existProduct);
        
    }


    
}
