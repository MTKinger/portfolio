/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public interface ProductInterface {
    
    public void loadFromFile() throws FileNotFoundException;
    public double getCostPerSquareFoot(String productType);
    public double getLaborPerSquareFoot(String productType);
    public ArrayList<String> getAllProductTypes();
    
    
}
