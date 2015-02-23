package com.swcguild.vendingmachine.dao;

import com.swcguild.vendingmachine.dto.Snack;

public interface SnackDao {
    
    public void addSnack(Snack snack);
    public void deleteSnack(String snackName);
    public void updateSnack(Snack snack);
    public Snack getSnackByName(String snackName);

}
