package BuisnessLogic;

import ConsoleIO.ConsoleIO;
import DataAccessObject.DVDCollection;
import DataTransferObject.DVD;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class DVDCollectionController {

    /**ConsoleIO cio = new ConsoleIO();
    DVDCollection library = new DVDCollection();
    Random r = new Random();

    public void run() {
        int userChoice = 0;
        cio.printMessage("\nWELCOME TO YOUR INTERACTIVE DVD COLLECTION!");
        try {
            library.loadLibrary();
            do {
                printMenu();
                userChoice = cio.getInt("Please pick"
                        + " an option:", 1, 6);
                switch (userChoice) {
                    case 1:
                        addDVD();
                        break;
                    case 2:
                        removeDVD();
                        break;
                    case 3:
                        getDVD();
                        break;
                    case 4:
                        viewAll();
                        break;
                    case 5:
                        doSearch();
                        break;
                    case 6:
                        cio.printMessage("NOW EXITING DVD COLLECTION...");
                        break;
                    default:
                        cio.printMessage("Please choose a valid menu choice!");
                }
            } while (userChoice != 6);
            cio.printMessage("\n\tTHAT'S ALL FOLKS...");
            library.writeLibrary();
        } catch (FileNotFoundException fnf) {
            cio.printMessage("ERROR LOADING FILE!");
        } catch (IOException ioe) {
            cio.printMessage("ERROR WRITING TO FILE!");
        }
    }

    public void printMenu() {
        cio.printMessage("\nPlease make a choice from the following"
                + " options:");
        cio.printMessage("\n\t1. Add a  DVD to your collection");
        cio.printMessage("\t2. Remove a DVD from your collection");
        cio.printMessage("\t3. Get a DVD From your collection");
        cio.printMessage("\t4. View your entire DVD collection");
        cio.printMessage("\t5. Search for a DVD in your collection");
        cio.printMessage("\t6. Exit DVD collection\n\n");
    }

    public void searchMenu() {
        cio.printMessage("");
        cio.printMessage("\tDVD SEARCH MENU");
        cio.printMessage("");
        cio.printMessage("1. Search for DVDs with a specific"
                + "MPAA Rating.");
        cio.printMessage("2. Search for DVDs by director.");
        cio.printMessage("3. Search for DVDs by studio.");
        cio.printMessage("4. Exit to main menu.");
        cio.printMessage("");
    }

    public void doSearch() {
        int userChoice = 0;
        do {
            searchMenu();
            userChoice = cio.getInt("Please select an option:", 1, 4);
            switch (userChoice) {
                case 1:
                    searchRating();
                    break;
                case 2:
                    searchDirector();
                    break;
                case 3:
                    searchStudio();
                    break;
                case 4:
                    cio.printMessage("NOW RETURNING TO MAIN MENU...");
                    break;
                default:
                    cio.printMessage("Please choose a valid menu choice!");
            }
        } while (userChoice != 4);
    }

    public void addDVD() {
        boolean more = true;
        String title = cio.getString("\nDVD Title:");
        int day = cio.getInt("DVD Release Day:", 1, 31);
        int month = cio.getInt("DVD Release Month:", 1, 12);
        int year = cio.getInt("DVD Release Year:", 1000, 9999);
        String rating = cio.getString("MPAA Rating"
                + " (G,PG,PG-13,R):");
        String director = cio.getString("DVD Director:");
        String studio = cio.getString("DVD Studio:");
        ArrayList<String> comments = new ArrayList<>();
        while (more == true) {
            String currentComment = cio.getString("Please"
                    + " enter a comment:");
            comments.add(currentComment);
            String yn = cio.getString("\nWould you like to add"
                    + " another comment (y or n)");
            if (yn.equalsIgnoreCase("y")) {
                more = true;
                cio.printMessage("");
            } else if (yn.equalsIgnoreCase("n")) {
                cio.getInt("Comments added.\nPress 1 to return to"
                        + " DVD collection menu", 1, 1);
                more = false;
            } else {
                cio.printMessage("Please enter a valid choice.");
            }
        }

        DVD currentDVD = new DVD();
        LocalDate ld = LocalDate.of(year, month, day);

        currentDVD.setComments(comments);
        currentDVD.setDirector(director);
        currentDVD.setRating(rating);
        currentDVD.setReleaseDate(ld);
        currentDVD.setStudio(studio);
        currentDVD.setTitle(title);
        String ident = String.valueOf(r.nextInt());
        currentDVD.setId(ident);
        library.addDVD(ident, currentDVD);
    }

    public void removeDVD() {
        String remove = cio.getString("Please enter the title of the DVD"
                + " you would like to remove from"
                + " your collection:");
        ArrayList<DVD> matches = new ArrayList<>();
        for (DVD currentDVD : library.getAllDVD()) {
            if (remove.equalsIgnoreCase(currentDVD.getTitle())) {
                matches.add(currentDVD);
            }
        }
        if (matches.size() == 1) {
            cio.printMessage("\"" + matches.get(0).getTitle()
                    + "\" will be removed from your collection.");
            library.removeDVD(matches.get(0).getId());
            cio.getInt("Press 1 to return to menu.", 1, 1);
        } else if (matches.size() > 1) {
            cio.printMessage("Muiltiple DVDs with this title have been"
                    + " found: ");
            for (DVD currentDVD : matches) {
                cio.printMessage(currentDVD.toString());
            }
            String choice = cio.getString("\nPlease enter"
                    + " the EXACT ID of the DVD you wish to"
                    + " remove:");
            cio.printMessage("\n\"" + library.getDVD(choice).getTitle()
                    + "\" will be removed from your collection.");
            library.removeDVD(choice);
            cio.getInt("Press 1 to return to menu.", 1, 1);
        } else {
            cio.getInt("No such DVD has been found."
                    + " Press 1 to return to menu", 1, 1);
        }
    }

    public void getDVD() {
        boolean found = false;
        String dvdTitle = cio.getString("Please enter the title of the DVD"
                + " you would like to find:");
        for (DVD currentDVD : library.getAllDVD()) {
            if (dvdTitle.equalsIgnoreCase(currentDVD.getTitle())) {
                cio.printMessage("\n");
                cio.printMessage(currentDVD.toString());
                found = true;
            }
        }
        if (found == false) {
            cio.printMessage("\nNo DVD with that title exists in your"
                    + " collection.");
            cio.getInt("\nPress 1 to return to menu.", 1, 1);
        }

    }

    public void viewAll() {
        for (DVD currentDVD : library.getAllDVD()) {
            cio.printMessage("");
            cio.printMessage(currentDVD.toString());
        }
        cio.printMessage("");
        cio.getInt("Press 1 to return to menu.", 1, 1);

    }

    public void searchDirector() {
        boolean found = false;
        String dvdTitle = cio.getString("Please enter the director"
                + " you would like to search for:");
        for (DVD currentDVD : library.getAllDVD()) {
            if (dvdTitle.equalsIgnoreCase(currentDVD.getDirector())) {
                cio.printMessage("\n");
                cio.printMessage(currentDVD.toString());
                found = true;
            }
        }
        if (found == false) {
            cio.printMessage("\nNo DVD by that director exists in your"
                    + " collection.");
            cio.getInt("\nPress 1 to return to menu.", 1, 1);
        }
    }

    public void searchRating() {
        boolean found = false;
        String dvdTitle = cio.getString("Please enter the MPAA rating"
                + " you would like to search for:");
        for (DVD currentDVD : library.getAllDVD()) {
            if (dvdTitle.equalsIgnoreCase(currentDVD.getRating())) {
                cio.printMessage("\n");
                cio.printMessage(currentDVD.toString());
                found = true;
            }
        }
        if (found == false) {
            cio.printMessage("\nNo DVD with that rating exists in your"
                    + " collection.");
            cio.getInt("\nPress 1 to return to menu.", 1, 1);
        }
    }

    public void searchStudio() {
        boolean found = false;
        String dvdTitle = cio.getString("Please enter the studio"
                + " you would like to search for:");
        for (DVD currentDVD : library.getAllDVD()) {
            if (dvdTitle.equalsIgnoreCase(currentDVD.getStudio())) {
                cio.printMessage("\n");
                cio.printMessage(currentDVD.toString());
                found = true;
            }
        }
        if (found == false) {
            cio.printMessage("\nNo DVD with from that studio exists in your"
                    + " collection.");
            cio.getInt("\nPress 1 to return to menu.", 1, 1);
        }
    }*/

}
