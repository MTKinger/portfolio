package com.swcguild.vendingmachine2.dao;

import com.swcguild.vendingmachine2.dto.Change;
import com.swcguild.vendingmachine2.dto.Snack;

public class ChangeDaoInMemImpl implements ChangeDao{

    @Override
    public Change makeChange(Change change, Snack snack) {
        int snackPrice = (int)(snack.getSnackPrice()*100);
        int changeTotal = (int)(change.getTotalChange()*100);
        
        changeTotal = changeTotal - snackPrice;
        
        while (changeTotal >= 25){
            changeTotal -=25;
            change.setQuarters(change.getQuarters() +1);
        }
        while (changeTotal >= 10){
            changeTotal -=10;
            change.setDimes(change.getDimes()+1);
        }
        while (changeTotal >= 5){
            changeTotal -=5;
            change.setNickles(change.getNickles() +1);
        }
        while (changeTotal >= 1){
            changeTotal -=1;
            change.setPennies(change.getPennies() +1);
        }
        change.setTotalChange(changeTotal);
        return change;
    }
    
    

}
