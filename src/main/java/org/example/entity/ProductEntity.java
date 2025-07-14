package org.example.entity;

public class ProductEntity {

    private String nameProduct;
    private double priceProduct;
    private int quantityProduct;

    public ProductEntity(){
    }

    public ProductEntity(String nameProduct, double priceProduct, int quantityProduct){
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.quantityProduct = quantityProduct;
    }

    public ProductEntity(String nameProduct, double priceProduct){
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public double totalValueStock() {
        return priceProduct * quantityProduct;
    }


    public void addProduct(int quantity) {
        this.quantityProduct += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantityProduct -= quantity;
    }

    public String toString() {
        return nameProduct
                + ", $ "
                + String.format("%.2f", priceProduct)
                + ", Quantity: "
                + quantityProduct
                + ", Total value in stock: $ "
                + String.format("%.2f", totalValueStock());
    }
}