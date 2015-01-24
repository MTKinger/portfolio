package com.swcguild.vendmachinelab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MachineInventory {
    
    ArrayList<Snack> inventory = new ArrayList<>();
    private final String MACHINE_FILE = "vendingMachine.txt";
    private final String DELIMITER = "::";
    
    public void restockMachine(){
        Snack snickers = new Snack("Snickers","A1", 100, 5);
        Snack take5 = new Snack("Take 5","A2", 125, 5);
        Snack reeses = new Snack("Reese's Pieces", "A3", 75, 5);
        Snack butterFinger = new Snack("Butterfinger","B1", 110, 5);
        Snack milkyWay = new Snack("Milky Way","B2", 90, 5);
        Snack famousAmos = new Snack("Famous Amos","B3", 150, 5);
        Snack mms = new Snack("M&Ms","C1", 80, 5);
        Snack doritos = new Snack("Doritos","C2", 135, 5);
        Snack lifeSavers = new Snack("Lifesavers","C3", 50, 5);

        inventory.add(snickers);
        inventory.add(take5);
        inventory.add(reeses);
        inventory.add(butterFinger);
        inventory.add(milkyWay);
        inventory.add(famousAmos);
        inventory.add(mms);
        inventory.add(doritos);
        inventory.add(lifeSavers);
    }
    
    public Snack getSnack(int element){
        return inventory.get(element);
    }
    
    public void removeSnack(int element){
        int remaining = inventory.get(element).getStock()-1;
        inventory.get(element).setStock(remaining);
    }
    
    public void writeInventory()throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(MACHINE_FILE));
        for(Snack current : inventory){
            out.print(current.getName() + DELIMITER + 
                    current.getSlot() + DELIMITER + 
                    current.getPrice() + DELIMITER +
                    current.getStock());
            out.println();
            out.flush();
        }
        out.close();
    }
    
    public void loadInventory()throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader(MACHINE_FILE)));
        String currentLine;
        String[] currentTokens;
        while(sc.hasNextLine()){
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            String name = currentTokens[0];
            String slot = currentTokens[1];
            String price = currentTokens[2];
            String stock = currentTokens[3];
            int priceInt = Integer.parseInt(price);
            int stockInt = Integer.parseInt(stock);
            Snack snack = new Snack(name, slot, priceInt, stockInt);
            inventory.add(snack);
        }
        sc.close();
    }

}
