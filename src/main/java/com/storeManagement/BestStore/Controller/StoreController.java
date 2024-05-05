package com.storeManagement.BestStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storeManagement.BestStore.Entity.Product;
import com.storeManagement.BestStore.Service.StoreImplement;


@RestController
@RequestMapping("/BestStore")
public class StoreController {

    @Autowired
    private StoreImplement storeService;

   @GetMapping("/ShowProducts")
   public List<Product> getAllProducts(){

    List<Product> list=storeService.getAllProducts();

    return list;
   }

   @PostMapping("/AddProduct")
   public String addProduct(@RequestBody Product product){

    storeService.saveProduct(product);
    
    return "Product added Successfully";
   }

   @PutMapping("/UpdateProduct/{id}")
   public String editProduct(@PathVariable int id, @RequestBody Product product){

    storeService.updateProduct(id, product);
    
    return "Product Updated Successfully";
   }

   @GetMapping("/ShowProducts/{id}")
   public Product getProduct(@PathVariable int id){

      return storeService.getProductById(id);
   }
    
   @DeleteMapping("/DeleteProduct/{id}")
   public String deleteProduct (@PathVariable int id){
    
    storeService.deleteProduct(id);

    return "Product Deleted Successfully";

   }
}
