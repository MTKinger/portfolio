package com.swcguild.dvdcollectionlab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DVDCollection {
    
    public static final String DVD_FILE = "dvdCollection.txt";
    public static final String DELIMITER = "::";
    
    private HashMap<String, DVD> collection = new HashMap<>();
    
    public DVD addDVD(String title, DVD dvd) {
        return collection.put(title, dvd);
    }
    
    public DVD getDVD(String title) {
        return collection.get(title);
    }
    
    public DVD removeDVD(String title) {
        return collection.remove(title);
    }
    
    public ArrayList<String> getTitles() {
        Set<String> titleSet = collection.keySet();
        ArrayList<String> titleList = new ArrayList<String>(titleSet);
        return titleList;
    }

    // J-Unit Required*******
    public ArrayList<String> getTitlesYear(int year) {
        Set<String> titleSet = collection.keySet();
        ArrayList<String> titleList = new ArrayList<>(titleSet);
        for (String title : titleList) {
            DVD currentDVD = collection.get(title);
            if (currentDVD.getReleaseDate() != year) {
                titleList.remove(title);
            }
        }
        return titleList;
    }

    // J-Unit Required
    public ArrayList<String> getTitlesMPAA(String mpaaRating) {
        Set<String> titleSet = collection.keySet();
        ArrayList<String> titleList = new ArrayList(titleSet);
        for (String title : titleList) {
            DVD dvd = new DVD(title);
            if (!dvd.getMPAA().equalsIgnoreCase(mpaaRating)) {
                titleList.remove(title);
            }
        }
        return titleList;
    }

    // J-Unit Required
    public ArrayList<String> getTitlesDirector(String director) {
        Set<String> titleSet = collection.keySet();
        ArrayList<String> titleList = new ArrayList<>(titleSet);
        for (String title : titleList) {
            DVD dvd = new DVD(title);
            if (!dvd.getDirector().equalsIgnoreCase(director)) {
                titleList.remove(title);
            }
        }
        return titleList;
    }

    // J-Unit Required
    public ArrayList<String> getTitleStudio(String studio) {
        Set<String> titleSet = collection.keySet();
        ArrayList<String> titleList = new ArrayList<>(titleSet);
        for (String title : titleList) {
            DVD dvd = new DVD(title);
            if (!dvd.getStudio().equalsIgnoreCase(studio)) {
                titleList.remove(title);
            }
        }
        return titleList;
    }

    // J-Unit Required
    public ArrayList<String> getTitleRating(double rating) {
        Set<String> titleSet = collection.keySet();
        ArrayList<String> titleList = new ArrayList(titleSet);
        for (String title : titleList) {
            DVD dvd = new DVD(title);
            if (dvd.getUserRating() < rating) {
                titleList.remove(title);
            }
        }
        return titleList;
    }
    
    public ArrayList<String> getTitleKeyWord(String keyword) {
        Set<String> titleSet = collection.keySet();
        ArrayList<String> titleList = new ArrayList<>(titleSet);
        boolean found = false;
        for (String title : titleList) {
            DVD currentDVD = collection.get(title);
            ArrayList<String> comments = currentDVD.getComments();
            for (int i = 0; i < comments.size() && found == false; i++) {
                String currentComment = comments.get(i);
                for (int j = 0; j < currentComment.length() - keyword.length()
                        && found == false; j++) {
                    if (currentComment.substring(j, j + keyword.length())
                            .equalsIgnoreCase(keyword)) {
                        found = true;
                    }
                }
            }
            if (found == false) {
                titleList.remove(title);
            }
        }
        return titleList;
    }
    
    public void loadDVDCollection() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(DVD_FILE)));
        String currentLine;
        String[] currentTokens;
        
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            DVD currentDVD = new DVD(currentTokens[0]);
            int year = Integer.parseInt(currentTokens[1]);
            currentDVD.setReleaseDate(year);
            currentDVD.setMPAA(currentTokens[2]);
            currentDVD.setDirector(currentTokens[3]);
            currentDVD.setStudio(currentTokens[4]);
            double rating = Double.parseDouble(currentTokens[5]);
            currentDVD.setUserRating(rating);
            ArrayList<String> comments = new ArrayList<>();
            for (int i = 6; sc.hasNext(); i++) {
                comments.set(i - 6, currentTokens[i]);
            }
            currentDVD.setComments(comments);
            
            collection.put(currentDVD.getTitle(), currentDVD);
        }
        sc.close();
    }
    
    public void writeAddressBook() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(DVD_FILE));
        
        ArrayList<String> titles = getTitles();
        for (String title : titles) {
            DVD currentDVD = collection.get(title);
            
            out.print(currentDVD.getTitle() + DELIMITER + currentDVD.getReleaseDate()
                    + DELIMITER + currentDVD.getMPAA() + DELIMITER + currentDVD.getDirector()
                    + DELIMITER + currentDVD.getStudio() + DELIMITER + currentDVD.getUserRating());
            
            ArrayList<String> comments = currentDVD.getComments();
            if (comments.size() > 0) {
                for (String comment : comments) {
                    out.print(DELIMITER + comment);
                }
                out.print("\n");
            }
            out.flush();
        }
        
        out.close();
    }
}
