package org.example;

import org.example.entity.ProductEntity;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data to be added in stock");
        System.out.print("Name: ");
        String nameProduct = sc.nextLine();
        System.out.print("Price: $ ");
        double priceProduct = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantityProduct = sc.nextInt();
        ProductEntity productEntity = new ProductEntity(nameProduct, priceProduct, quantityProduct);

        System.out.println();
        System.out.println("Product data: " + productEntity);

        System.out.println("Enter product data to be added in stock");
        quantityProduct = sc.nextInt();
        productEntity.addProduct(quantityProduct);

        System.out.println();
        System.out.println("Updated: " + productEntity);

        System.out.println("Enter product data to be removed from stock");
        quantityProduct = sc.nextInt();
        productEntity.removeProduct(quantityProduct);

        System.out.println();
        System.out.println("Updated: " + productEntity);

        sc.close();
    }
}