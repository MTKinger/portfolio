package com.swcguild.dvdcollectionlab;

import java.util.ArrayList;

public class DVDCollectionController {

    ConsoleIO cio = new ConsoleIO();
    DVDCollection collection = new DVDCollection();

    public void printMenu() {
        cio.printMessage("\nDVD COLLECTION MENU");
        cio.printMessage("\n1. Add a DVD to your collection");
        cio.printMessage("2. Remove a DVD from your collection");
        cio.printMessage("3. Find a DVD in your collection by title");
        cio.printMessage("4. Search for a DVD to watch");
        cio.printMessage("5. View entire DVD collection");
        cio.printMessage("6. Load DVD collection");
        cio.printMessage("7. Exit and Save");
        cio.printMessage("");
    }

    public void addDVD() {
        cio.printMessage("");
        String title = cio.getString("Title of DVD you wish to add: ");
        int releaseDate = cio.getInt("Release date for \"" + title + "\":");
        String mpaaRating = cio.getString("MPAA Rating (G, PG, PG-13, or R):");
        String director = cio.getString("Director of \"" + title + "\":");
        String studio = cio.getString("Studio the produced \"" + title + "\":");
        double userRating = cio.getDouble("Your rating for \"" + title + "\" (Out of 5)", 0.0, 5.0);
        ArrayList<String> userComments = new ArrayList<>();
    }   
    
    
    //  Not sure if this should go in DVDCollection class or stay here
    public ArrayList<String> addComments(ArrayList<String> comments){
        String choice1 = cio.getString("\nWould you like to add a comment to this DVD (y or n)?");
        // Have to remember to make this a loop where user can add as many comments as they want
        
        
        return comments;
    }
}
