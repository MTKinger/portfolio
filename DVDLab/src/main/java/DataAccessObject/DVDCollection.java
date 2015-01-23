package DataAccessObject;

import DataTransferObject.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DVDCollection {

    HashMap<String, DVD> library = new HashMap<>();
    Set<String> identifiers = library.keySet();
    String LIBRARY_FILE = "library.txt";
    String DELIMITER = "::";

    public int librarySize() {
        int size = library.size();
        return size;
    }

    public DVD addDVD(String id, DVD dvd) {
        return library.put(id, dvd);
    }

    public DVD removeDVD(String id) {
        return library.remove(id);
    }

    public DVD getDVD(String id) {
        return library.get(id);
    }

    public ArrayList<DVD> getAllDVD() {
        ArrayList<DVD> allDVD = new ArrayList<>();
        for (String key : identifiers) {
            DVD currentDVD = new DVD();
            currentDVD = library.get(key);
            allDVD.add(currentDVD);
        }
        return allDVD;
    }

    public void writeLibrary() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        for (String id : identifiers) {
            DVD currentDVD = this.getDVD(id);
            LocalDate ld = currentDVD.getReleaseDate();
            int day = ld.getDayOfMonth();
            int month = ld.getMonthValue();
            int year = ld.getYear();
            ArrayList<String> comments = currentDVD.getComments();
            out.print(currentDVD.getTitle() + DELIMITER
                    + day + DELIMITER + month + DELIMITER
                    + year + DELIMITER + currentDVD.getRating()
                    + DELIMITER + currentDVD.getDirector()
                    + DELIMITER + currentDVD.getStudio()
                    + DELIMITER + currentDVD.getId());
            if (comments.size() != 0) {
                for (String comment : comments) {
                    out.print(DELIMITER + comment);
                }
            }
            out.println();
            out.flush();
        }
        out.close();
    }
    
    public void loadLibrary()throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        String currentLine;
        String[] currentTokens;
        while(sc.hasNextLine()){
            ArrayList<String> comments = new ArrayList<>();
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            DVD currentDVD = new DVD();
            currentDVD.setTitle(currentTokens[0]);
            String day = currentTokens[1];
            String month = currentTokens[2];
            String year = currentTokens[3];
            int dayInt = Integer.parseInt(day);
            int monthInt = Integer.parseInt(month);
            int yearInt = Integer.parseInt(year);
            LocalDate ld = LocalDate.of(yearInt, Month.of(monthInt), dayInt);
            currentDVD.setReleaseDate(ld);
            currentDVD.setRating(currentTokens[4]);
            currentDVD.setDirector(currentTokens[5]);
            currentDVD.setStudio(currentTokens[6]);
            currentDVD.setId(currentTokens[7]);
            for (int i = 8; i < currentTokens.length; i++){
                comments.add(currentTokens[i]);
            }
            currentDVD.setComments(comments);
            library.put(currentDVD.getId(), currentDVD);
        }
        sc.close();
    }
}
