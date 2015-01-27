package BuisnessLogic;

import BuisnessLogic.*;
import UI.ConsoleIO;
import java.io.FileNotFoundException;

public class ManagementController {

    ConsoleIO cio = new ConsoleIO();
    int menuChoice;

    public void run() {
        doMenu();
    }

    private void doMenu() {
        do {
            printMenu();
            menuChoice = cio.getInt("Please make a selection from the above choices:", 1, 6);
            switch (menuChoice) {
                case 1:
                    // displayOrders();
                    break;
                case 2:
                    // addOrder();
                    break;
                case 3:
                    // editOrder();
                    break;
                case 4:
                    // removeOrder();
                    break;
                case 5:
                    // saveCurrentWork();
                    break;
                case 6:
                    // exit();
                    break;
                default:
                    cio.printMessage("Please enter a valid menu choice!\n");
                    break;
            }
        } while (menuChoice != 6);
        cio.printMessage("\n\nThank you for chosing SWC Corp...");
    }

    private void printMenu() {
        cio.printMessage("\n\n***************************************************");
        cio.printMessage("*\tSWC Corp. Flooring Program");
        cio.printMessage("*");
        cio.printMessage("* 1. Display Orders");
        cio.printMessage("* 2. Add an Order");
        cio.printMessage("* 3. Edit an Order");
        cio.printMessage("* 4. Remove an Order");
        cio.printMessage("* 5. Save Current Work");
        cio.printMessage("* 6. Quit");
        cio.printMessage("*");
        cio.printMessage("***************************************************\n\n");
    }

}
