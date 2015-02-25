/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine2.dao;

import com.swcguild.vendingmachine2.dto.Snack;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface SnackDao {
    
    public void addSnack(Snack snack);
    public void removeSnack(int snackId);
    public Snack getSnackById(int snackId);
    public List<Snack> getAllSnacks();
    public double getSnackPrice(int snackId);
    
    
}
