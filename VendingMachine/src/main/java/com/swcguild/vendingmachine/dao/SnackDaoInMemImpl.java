package com.swcguild.vendingmachine.dao;

import com.swcguild.vendingmachine.dto.Snack;
import java.util.HashMap;
import java.util.Map;

public class SnackDaoInMemImpl implements SnackDao{
    
    private Map<String, Snack> snackInventory = new HashMap<>();

    @Override
    public void addSnack(Snack snack) {
        snackInventory.put(snack.getSnackName(), snack);
    }

    @Override
    public void deleteSnack(String snackName) {
        Snack snack = snackInventory.get(snackName);
        int newQuantity = snack.getSnackRemaining() - 1;
        snack.setSnackRemaining(newQuantity);
        snackInventory.put(snackName, snack);
    }

    @Override
    public void updateSnack(Snack snack) {
        snackInventory.put(snack.getSnackName(), snack);
    }

    @Override
    public Snack getSnackByName(String snackName) {
        return snackInventory.get(snackName);
    }
    
    

}
