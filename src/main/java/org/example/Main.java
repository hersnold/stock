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

        ProductEntity productEntity = new ProductEntity();

        System.out.println("Enter product data to be added in stock");
        System.out.print("Name: ");
        productEntity.nameProduct = sc.nextLine();
        System.out.print("Price: $ ");
        productEntity.priceProduct = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        productEntity.quantityProduct = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + productEntity);

        System.out.println("Enter product data to be added in stock");
        int quantity = sc.nextInt();
        productEntity.addProduct(quantity);

        System.out.println();
        System.out.println("Updated: " + productEntity);

        System.out.println("Enter product data to be removed from stock");
        quantity = sc.nextInt();
        productEntity.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated: " + productEntity);

        sc.close();
    }
}