package com.swcguild.vendmachinelab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MachineController {

    Scanner sc = new Scanner(System.in);
    MachineInventory mi = new MachineInventory();
    ConsoleIO cio = new ConsoleIO();
    int again = 0;

    public void run() {
        try {
            mi.loadInventory();
            do {
                transaction();
            } while (again != 2);
            mi.writeInventory();
        } catch (FileNotFoundException fnf) {
            cio.printMessage("MACHINE IS NOT AVAILABLE AT THIS TIME!!!");
        } catch (IOException ioe) {
            cio.printMessage("ERROR SAVING MACHINE TO FILE!!!!");
        }
    }

    private void transaction() {
        machineDisplay();
        int element = 22;
        double moneyDouble = cio.getDouble("Please enter your cash ($.¢¢): ");
        int moneyInt = convertToInt(moneyDouble);
        String choice = cio.getString("Please enter the slot for the item you wish to purchase"
                + " (Case Sensitive) :");
        switch (choice) {
            case "A1":
                element = 0;
                break;
            case "A2":
                element = 1;
                break;
            case "A3":
                element = 2;
                break;
            case "B1":
                element = 3;
                break;
            case "B2":
                element = 4;
                break;
            case "B3":
                element = 5;
                break;
            case "C1":
                element = 6;
                break;
            case "C2":
                element = 7;
                break;
            case "C3":
                element = 8;
                break;
            default:
                cio.printMessage("Please enter a valid item code!\n");
                break;
        }
        if (element == 22) {
            Change giveBack = new Change(moneyInt);
            cio.printMessage(giveBack.changeToString());
            again = cio.getInt("Would you like to try again?"
                    + " (1 for yes, 2 for no)", 1, 2);
        } else if (moneyInt < mi.inventory.get(element).getPrice()) {
            cio.printMessage("Insufficient money for this choice!\n");
            Change giveBack = new Change(moneyInt);
            cio.printMessage(giveBack.changeToString());
        } else {
            if (mi.inventory.get(element).getStock() == 0) {
                cio.printMessage("There are no more of that item at this time.\n");
                Change giveBack = new Change(moneyInt);
                cio.printMessage(giveBack.changeToString());
            } else {
                mi.removeSnack(element);
                cio.printMessage("Here is your " + mi.inventory.get(element).getName());
                int moneyNow = moneyInt - mi.inventory.get(element).getPrice();
                Change giveBack = new Change(moneyNow);
                cio.printMessage(giveBack.changeToString());
            }
        }
        if (element != 22) {
            again = cio.getInt("Would you like to make another purchase?"
                    + " (1 for yes, 2 for no)", 1, 2);
        }
    }

    private void machineDisplay() {
        for (Snack current : mi.inventory) {
            System.out.println(current.snackToString());
        }
    }

    public int convertToInt(double userInput) {
        int toInt = (int) (userInput * 100);
        return toInt;
    }

    public double convertToDouble(int userInput) {
        double toDouble = (double) (userInput / 100);
        return toDouble;
    }
}
