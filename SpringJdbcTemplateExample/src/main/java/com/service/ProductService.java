package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {			// id is productService

//	@Autowired
//	ProductDao productDao;
	
	final ProductDao productDao;
	
	
	ProductService(ProductDao productDao){
		this.productDao=productDao;
	}
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "price must be > 1000";
		}else if(productDao.storeProduct(product)>0) {
			return "Product stored";
		}else {
			return "Product didn't store";
		}
	}
	

	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)>0) {
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
		
	}
	
	public String deleteProduct(int pid) {
		if(productDao.deleteProduct(pid)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
		
	}
	
	public List<Map<String, Object>> findAllProductByMap(){
		return productDao.findAllProductByMap();
	}
	
	public List<Product> findProductByProduct(){
		return productDao.findAllProductByProduct();
	}
	
	
	public List<Product> findProductByPrice(float price){
		return productDao.findAllProductByProductByPrice(price);
	}
}
