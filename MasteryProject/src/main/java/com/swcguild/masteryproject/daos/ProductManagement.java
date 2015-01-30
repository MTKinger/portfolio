/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ProductManagement implements ProductInterface {

    final String DELIMITER = ",";
    final String TARGET_FILE = "products.txt";
    ArrayList<Product> allProducts = new ArrayList<>();

    //**TESTED**
    @Override
    public void loadFromFile() throws FileNotFoundException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader(TARGET_FILE)));
        String currentLine = sc.nextLine();
        String[] currentTokens;
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            String productType = currentTokens[0];
            double costPerSquareFoot = Double.parseDouble(currentTokens[1]);
            double laborPerSquareFoot = Double.parseDouble(currentTokens[2]);
            Product currentProduct = new Product();
            currentProduct.setProductType(productType);
            currentProduct.setCostPSF(costPerSquareFoot);
            currentProduct.setLaborPSF(laborPerSquareFoot);
            allProducts.add(currentProduct);
        }
        sc.close();
    }

    public void writeToFile() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(TARGET_FILE));
        out.println("ProductType, CostPerSquareFoot, LaborPerSquareFoot");
        for (Product currentProduct : allProducts) {
            out.println(currentProduct.getProductType() + DELIMITER
                    + currentProduct.getCostPSF() + DELIMITER
                    + currentProduct.getLaborPSF());
            out.flush();
        }
        out.close();
    }
    //**TESTED**

    @Override
    public double getCostPerSquareFoot(String productType) {
        double costPSF = 0;
        for (Product currentProduct : allProducts) {
            if (currentProduct.getProductType().equalsIgnoreCase(productType)) {
                costPSF = currentProduct.getCostPSF();
            }
        }
        return costPSF;
    }

    //**TESTED**
    @Override
    public double getLaborPerSquareFoot(String productType) {
        double costLSF = 0;
        for (Product currentProduct : allProducts) {
            if (currentProduct.getProductType().equalsIgnoreCase(productType)) {
                costLSF = currentProduct.getLaborPSF();
            }
        }
        return costLSF;
    }

    //**TESTED**
    @Override
    public ArrayList<String> getAllProductTypes() {
        ArrayList<String> allProductTypes = new ArrayList<>();
        for (Product currentProduct : allProducts) {
            String productName = currentProduct.getProductType();
            allProductTypes.add(productName);
        }
        return allProductTypes;
    }
    
    public ArrayList<Product> getAllProducts(){
        return allProducts;
    }

    //**TESTED
    public int getSize() {
        return allProducts.size();
    }

    public void clearAllProducts() {
        allProducts.clear();
    }

    public void addProduct(Product product) {
        allProducts.add(product);
    }

    
    public ArrayList<Product> removeProduct(String productType, ArrayList<Product> productToBeDeleted) {
        int index = 0;
        boolean found = false;
        for (Product currentProduct : productToBeDeleted) {
            if (currentProduct.getProductType().equalsIgnoreCase(productType)) {
                index = productToBeDeleted.indexOf(currentProduct);
                found = true;
            }
        }
        if (found == true) {
            productToBeDeleted.remove(index);
        }
        return productToBeDeleted;
    }

}
