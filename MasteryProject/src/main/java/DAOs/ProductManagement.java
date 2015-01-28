/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ProductManagement implements ProductInterface {
    
    final String DELIMITER = ":::";
    final String TARGET_FILE = "products.txt";
    ArrayList<Product> allProducts = new ArrayList<>();

    @Override
    public void loadFromFile() throws FileNotFoundException {
        
        Scanner sc = new Scanner(new BufferedReader(new FileReader(TARGET_FILE)));
        String currentLine;
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

    @Override
    public double getCostPerSquareFoot(String productType) {
        double costPSF = 0;
        for(Product currentProduct : allProducts) {
            if (currentProduct.getProductType().equalsIgnoreCase(productType)) {
                costPSF = currentProduct.getCostPSF();
            }
        }
        return costPSF;
    }

    @Override
    public double getLaborPerSquareFoot(String productType) {
        double costLSF = 0;
        for(Product currentProduct : allProducts) {
            if (currentProduct.getProductType().equalsIgnoreCase(productType)) {
                costLSF = currentProduct.getLaborPSF();
            }
        }
        return costLSF;
    }

    @Override
    public ArrayList<String> getAllProductTypes() {
        ArrayList<String> allProductTypes = new ArrayList<>();
        for(Product currentProduct : allProducts) {
            String productName = currentProduct.getProductType();
            allProductTypes.add(productName);
        }
        return allProductTypes;
    }
    
    public int getSize() {
        return allProducts.size();
    }
    
    public void clearAllProducts() {
        allProducts.clear();
    }
    
    
    
}
