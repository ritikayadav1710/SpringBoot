package com.ritika.simpleWebApp.service;

import com.ritika.simpleWebApp.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"iPhone",50000), new Product(102,"Canon camera",70000), new Product(103,"mic",10000)));

    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p ->p.getProdId() == prodId)
                .findFirst()
                .orElse(new Product(100, "no item", 0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prod.getProdId())
                index=i;
        }
        products.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodId)
                index=i;
        }
        products.remove(index);
    }
}
