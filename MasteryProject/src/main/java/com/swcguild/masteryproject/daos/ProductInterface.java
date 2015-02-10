/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Product;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public interface ProductInterface {

    void addProduct(Product product);

    void clearAllProducts();

    //**TESTED**
    ArrayList<String> getAllProductTypes();

    ArrayList<Product> getAllProducts();

    double getCostPerSquareFoot(String productType);

    //**TESTED**
    double getLaborPerSquareFoot(String productType);

    //**TESTED
    int getSize();

    //**TESTED**
    void loadFromFile() throws FileNotFoundException;

    ArrayList<Product> removeProduct(String productType, ArrayList<Product> productToBeDeleted);

    void writeToFile() throws IOException;
    //**TESTED**
    
}
