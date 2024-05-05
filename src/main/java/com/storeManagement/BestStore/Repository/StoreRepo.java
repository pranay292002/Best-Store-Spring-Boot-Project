package com.storeManagement.BestStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeManagement.BestStore.Entity.Product;

public interface StoreRepo extends JpaRepository <Product, Integer> {

    
    
}
