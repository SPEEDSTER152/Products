package Repositories;

import entities.Product;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository extends JpaRepositoriesAutoConfiguration<Product, UUID> {

    static UUID save(UUID product) {
        return product;
    }

    public List<Product> findbyNameProduct(String NameProduct);

    List<Product> findall();

    Optional<Object> findbyId(UUID codeProduct);
}
