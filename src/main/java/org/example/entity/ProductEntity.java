package org.example.entity;

public class ProductEntity {

    public String nameProduct;
    public double priceProduct;
    public int quantityProduct;

    public double totalValueStock(){
        return priceProduct * quantityProduct;    }


    public void addProduct(int quantity){
        this.quantityProduct += quantity;
    }

    public void removeProduct(int quantity){
        this.quantityProduct -= quantity;
    }

    public String toString(){
        return nameProduct
                + ", $ "
                + String.format("%.2f", priceProduct)
                + ", Quantity: "
                + quantityProduct
                + ", Total value in stock: $ "
                + String.format("%.2f", totalValueStock());
    }
}