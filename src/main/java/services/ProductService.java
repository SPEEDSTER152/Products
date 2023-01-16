package services;

import Repositories.ProductRepository;
import entities.Product;

import java.util.List;
import java.util.UUID;

public class ProductService {

    private Product Product;

    private static ProductRepository productRepository;

    public static UUID save(UUID product){
        return ProductRepository.save(product);
    }

    public static List<Product> findByNameProduct(String nameProduct){
        return productRepository.findbyNameProduct(nameProduct);
    }
    public entities.Product findById(UUID codeProduct){
        return (entities.Product) productRepository.findbyId(codeProduct).orElseThrow();
    }

    public List<Product> findall(){
        return productRepository.findall();
    }
}
