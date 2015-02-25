/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine2.dao;

import com.swcguild.vendingmachine2.dto.Change;
import com.swcguild.vendingmachine2.dto.Snack;

/**
 *
 * @author apprentice
 */
public interface ChangeDao {
    
    public Change makeChange(Change change, Snack snack);
    
}
