package entities;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.UUID;

public class Product {

    private UUID CodeProduct;

    private String nameProduct;

    private BigDecimal price;

    private Double maxPercentage;

    public Product(){

    }

    public Product(UUID codeProduct, String nameProduct, BigDecimal price, Double maxPercentage) {
        this.CodeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.maxPercentage = maxPercentage;
    }

    public UUID getCodeProduct() {
        return CodeProduct;
    }

    public void setCodeProduct(UUID codeProduct) {
        CodeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getMaxPercentage() {
        return maxPercentage;
    }

    public void setMaxPercentage(Double maxPercentage) {
        this.maxPercentage = maxPercentage;
    }
}
