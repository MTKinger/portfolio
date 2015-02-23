package com.swcguild.vendingmachine.dao;

import com.swcguild.vendingmachine.dto.Change;

public class ChangeDaoInMemImpl implements ChangeDao{

    @Override
    public Change returnDollars(Change moneyIn) {
        int dollars = 0;
        int totalMoney = moneyIn.getMoneyIn();
        while (totalMoney >= 100){
            dollars ++;
            totalMoney -= 100;
        }
        moneyIn.setDollars(dollars);
        moneyIn.setMoneyIn(totalMoney);
        return moneyIn;
    }

    @Override
    public Change returnQuarters(Change moneyIn) {
        int quarters = 0;
        int totalMoney = moneyIn.getMoneyIn();
        while (totalMoney >= 25){
            quarters ++;
            totalMoney -= 25;
        }
        moneyIn.setQuarters(quarters);
        moneyIn.setMoneyIn(totalMoney);
        return moneyIn;
    }

    @Override
    public Change returnDimes(Change moneyIn) {
        int dimes = 0;
        int totalMoney = moneyIn.getMoneyIn();
        while (totalMoney >= 10){
            dimes ++;
            totalMoney -= 10;
        }
        moneyIn.setDimes(dimes);
        moneyIn.setMoneyIn(totalMoney);
        return moneyIn;
    }

    @Override
    public Change returnNickles(Change moneyIn) {
        int nickles = 0;
        int totalMoney = moneyIn.getMoneyIn();
        while (totalMoney >= 5){
            nickles ++;
            totalMoney -= 5;
        }
        moneyIn.setNickles(nickles);
        moneyIn.setMoneyIn(totalMoney);
        return moneyIn;
    }

    @Override
    public Change returnPennies(Change moneyIn) {
        int pennies = 0;
        int totalMoney = moneyIn.getMoneyIn();
        while (totalMoney >= 1){
            pennies ++;
            totalMoney -= 1;
        }
        moneyIn.setPennies(pennies);
        moneyIn.setMoneyIn(totalMoney);
        return moneyIn;
    }
    
    

}
