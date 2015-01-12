package com.swcguild.methods;

import java.util.Scanner;

public class KeyChains {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int input = 0;
        int totalKeychains = 0;
        int keyCost = 10;

        System.out.println("Ye Olde Keychain Shoppe\n");

        do {
            Thread.sleep(1500);
            System.out.println("\n1. Add keychains to order");
            System.out.println("2. Remove keychains from order");
            System.out.println("3. View current order");
            System.out.println("4. Checkout\n");
            System.out.print("Please enter your choice: ");
            input = sc.nextInt();

            if (input == 1) {
                totalKeychains = add_key(totalKeychains);
                System.out.println("You now have " + totalKeychains + " keychains.");
            } else if (input == 2) {
                totalKeychains = remove_key(totalKeychains);
                System.out.println("You now have " + totalKeychains + " keychains.");
            } else if (input == 3) {
                System.out.println(view_order(totalKeychains, keyCost));
            } else if (input == 4) {
                System.out.println(checkout(totalKeychains, keyCost));
            } else {
                System.out.println("\nERROR.\n");
            }
        } while (input != 4);
        //System.out.println(totalKeychains);
    }

    public static int add_key(int oldTotal) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow many to add? ");
        int keychainsAdded = sc.nextInt();
        System.out.println("");
        return keychainsAdded + oldTotal;
    }

    public static int remove_key(int oldTotal) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow many would you like to remove? ");
        int keychainsRemoved = sc.nextInt();
        System.out.println("");
        return oldTotal - keychainsRemoved;
    }

    public static String view_order(int totalKeychains, int keyCost) {
        String order = "\nYou have " + totalKeychains + " keychains.\nKeychains cost $" + keyCost + " each.\nTotal cost is $" + (totalKeychains * keyCost) + ".";
        return order;
    }

    public static String checkout(int totalKeychains, int keyCost) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nWhat is your name? ");
        String name = sc.nextLine();
        System.out.println("You have " + totalKeychains + " keychains.");
        System.out.println("Keychains cost $" + keyCost + " each.");
        System.out.println("Total cost is $" + (totalKeychains * keyCost) + ".");
        String thankYou = "Thanks for your order " + name + ".";
        return thankYou;
    }

}
