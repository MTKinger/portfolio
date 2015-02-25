package com.swcguild.vendingmachine2.dao;

import com.swcguild.vendingmachine2.dto.Snack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnackDaoInMemImpl implements SnackDao{
    
    Map<Integer, Snack> snackMap = new HashMap<>();
    
    public SnackDaoInMemImpl(){
        Snack newSnack1 = new Snack();
        newSnack1.setSnackId(1);
        newSnack1.setSnackName("Snickers");
        newSnack1.setSnackPrice(1.00);
        newSnack1.setSnackLeft(7);
        newSnack1.setImage("./img/snickers.jpg");
        
        Snack newSnack2 = new Snack();
        newSnack2.setSnackId(2);
        newSnack2.setSnackName("Reece's Pieces");
        newSnack2.setSnackPrice(0.75);
        newSnack2.setSnackLeft(9);
        newSnack2.setImage("./img/reeces-pieces.jpg");
        
        Snack newSnack3 = new Snack();
        newSnack3.setSnackId(3);
        newSnack3.setSnackName("Oreos");
        newSnack3.setSnackPrice(0.85);
        newSnack3.setSnackLeft(10);
        newSnack3.setImage("./img/oreo.jpg");
        
        Snack newSnack4 = new Snack();
        newSnack4.setSnackId(4);
        newSnack4.setSnackName("Take 5");
        newSnack4.setSnackPrice(1.10);
        newSnack4.setSnackLeft(5);
        newSnack4.setImage("./img/take5.jpg");
        
        Snack newSnack5 = new Snack();
        newSnack5.setSnackId(5);
        newSnack5.setSnackName("Famous Amos");
        newSnack5.setSnackPrice(1.25);
        newSnack5.setSnackLeft(14);
        newSnack5.setImage("./img/famousAmos.jpg");
        
        Snack newSnack6 = new Snack();
        newSnack6.setSnackId(6);
        newSnack6.setSnackName("M&Ms");
        newSnack6.setSnackPrice(0.50);
        newSnack6.setSnackLeft(11);
        newSnack6.setImage("./img/mms.jpg");
        
        Snack newSnack7 = new Snack();
        newSnack7.setSnackId(7);
        newSnack7.setSnackName("Swedish Fish");
        newSnack7.setSnackPrice(0.95);
        newSnack7.setSnackLeft(15);
        newSnack7.setImage("./img/swedishFish.jpg");
        
        Snack newSnack8 = new Snack();
        newSnack8.setSnackId(8);
        newSnack8.setSnackName("Doritos");
        newSnack8.setSnackPrice(1.30);
        newSnack8.setSnackLeft(8);
        newSnack8.setImage("./img/doritos.jpg");
        
        Snack newSnack9 = new Snack();
        newSnack9.setSnackId(9);
        newSnack9.setSnackName("Junior Mints");
        newSnack9.setSnackPrice(0.60);
        newSnack9.setSnackLeft(12);
        newSnack9.setImage("./img/juniorMints.jpg");
        
        snackMap.put(newSnack1.getSnackId(), newSnack1);
        snackMap.put(newSnack2.getSnackId(), newSnack2);
        snackMap.put(newSnack3.getSnackId(), newSnack3);
        snackMap.put(newSnack4.getSnackId(), newSnack4);
        snackMap.put(newSnack5.getSnackId(), newSnack5);
        snackMap.put(newSnack6.getSnackId(), newSnack6);
        snackMap.put(newSnack7.getSnackId(), newSnack7);
        snackMap.put(newSnack8.getSnackId(), newSnack8);
        snackMap.put(newSnack9.getSnackId(), newSnack9);
    }
    

    @Override
    public void addSnack(Snack snack) {
        snackMap.put(snack.getSnackId(), snack);
    }

    @Override
    public void removeSnack(int snackId) {
        snackMap.remove(snackId);
    }

    @Override
    public Snack getSnackById(int snackId) {
        return snackMap.get(snackId);
    }

    @Override
    public List<Snack> getAllSnacks() {
        Collection<Snack> snacks = snackMap.values();
        return new ArrayList(snacks);
    }

    @Override
    public double getSnackPrice(int snackId) {
        return snackMap.get(snackId).getSnackPrice();
    }
    
    

}
