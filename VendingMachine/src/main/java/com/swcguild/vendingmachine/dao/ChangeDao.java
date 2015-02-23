/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine.dao;

import com.swcguild.vendingmachine.dto.Change;

/**
 *
 * @author apprentice
 */
public interface ChangeDao {
    
    public Change returnDollars(Change moneyIn);
    public Change returnQuarters(Change moneyIn);
    public Change returnDimes(Change moneyIn);
    public Change returnNickles(Change moneyIn);
    public Change returnPennies(Change moneyIn);
    
}
