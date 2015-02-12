package DataAccessObject;

import com.swcguild.dvdlibrary.dto.DVD;
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
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class DVDLabImpl implements DVDLabDao {

    HashMap<Integer, DVD> library = new HashMap<>();
    Set<Integer> identifiers = library.keySet();
    String LIBRARY_FILE = "library.txt";
    String DELIMITER = "::";
    String COUNTER_FILE = "counter.txt";
    int counter = 0;

    @Override
    public void writeLibrary() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(COUNTER_FILE));
        for (int id : identifiers) {
            DVD thisDVD = getDVD(id);
            LocalDate ld = thisDVD.getReleaseDate();
            int day = ld.getDayOfMonth();
            int month = ld.getMonthValue();
            int year = ld.getYear();
            ArrayList<String> comments = thisDVD.getComments();
            out.print(thisDVD.getTitle() + DELIMITER
                    + day + DELIMITER + month + DELIMITER
                    + year + DELIMITER + thisDVD.getRating()
                    + DELIMITER + thisDVD.getDirector()
                    + DELIMITER + thisDVD.getStudio()
                    + DELIMITER + thisDVD.getDvdID());
            if (!comments.isEmpty()) {
                for (String comment : comments) {
                    out.print(DELIMITER + comment);
                }
            }
            out.println();
            out.flush();
        }
        out.close();
    }

    @Override
    public void loadLibrary() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        String currentLine;
        String[] currentTokens;
        while (sc.hasNextLine()) {
            ArrayList<String> comments = new ArrayList<>();
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            String title = (currentTokens[0]);
            String day = currentTokens[1];
            String month = currentTokens[2];
            String year = currentTokens[3];
            int dayInt = Integer.parseInt(day);
            int monthInt = Integer.parseInt(month);
            int yearInt = Integer.parseInt(year);
            LocalDate releaseDate = LocalDate.of(yearInt, Month.of(monthInt), dayInt);
            String rating = (currentTokens[4]);
            String director = (currentTokens[5]);
            String Studio = (currentTokens[6]);
            int dvdId = (Integer.parseInt(currentTokens[7]));
            for (int i = 8; i < currentTokens.length; i++) {
                comments.add(currentTokens[i]);
            }
            DVD thisDVD = new DVD(dvdId);
            thisDVD.setTitle(title);
            thisDVD.setReleaseDate(releaseDate);
            thisDVD.setRating(rating);
            thisDVD.setDirector(director);
            thisDVD.setStudio(Studio);
            thisDVD.setComments(comments);
            library.put(thisDVD.getDvdID(), thisDVD);
        }
        sc.close();
    }

    @Override
    public int getLibrarySize() {
        return this.library.size();
    }

    @Override
    public void addDVD(DVD dvd) {
        library.put(dvd.getDvdID(), dvd);
    }

    @Override
    public void removeDVD(int id) {
        library.remove(id);
    }

    @Override
    public DVD getDVD(int dvdID) {
        return library.get(dvdID);
    }
    
    @Override
    public void updateDVD(DVD dvd){
        library.put(dvd.getDvdID(), dvd);
    }

    @Override
    public List<DVD> getAllDVD() {
        return new ArrayList<DVD>(library.values());
    }

    @Override
    public List<DVD> getDVDByReleaseDate(int years) {
        return library.values().stream()
                .filter(dvd -> dvd.getAge() > years)
                .collect(Collectors.toList());
    }

    @Override
    public List<DVD> getDVDByMPAA(String mpaa) {
        return library.values().stream()
                .filter(dvd -> dvd.getRating().equalsIgnoreCase(mpaa))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, List<DVD>> getDVDByDirector(String director) {
        return library.values().stream()
                .filter(dvd -> dvd.getDirector().equalsIgnoreCase(director))
                .collect(Collectors.groupingBy(DVD::getRating));
    }

    @Override
    public List<DVD> getDVDByStudio(String studio) {
        return library.values().stream()
                .filter(dvd -> dvd.getStudio().equalsIgnoreCase(studio))
                .collect(Collectors.toList());
    }

    @Override
    public double getAverageAge() {
        return library.values().stream()
                .mapToLong(DVD::getAge)
                .average()
                .getAsDouble();
    }

    @Override
    public DVD findNewestDVD() {
//        ArrayList<Integer> foo = new ArrayList<>();
//        foo.add(10);
//        foo.add(9);
//        foo.add(8);
        
//        int max = foo.stream().mapToInt(p->p).min().getAsInt();
        
        Set<Integer> keySet = library.keySet();
        long dvdMinAge = 100000000;
        DVD newest = new DVD(0);
        List<Integer> keyList = new ArrayList(keySet);
        for (int thisDvdId : keyList) {
            DVD thisDVD = new DVD(thisDvdId);
            if (thisDVD.getAge() > 0 && thisDVD.getAge() < dvdMinAge) {
                dvdMinAge = thisDVD.getAge();
                newest = library.get(thisDvdId);
            }
        }
        return newest;
    }

    @Override
    public DVD findOldestDVD() {
        Set<Integer> keySet = library.keySet();
        long dvdMaxAge = 0;
        DVD newest = new DVD(0);
        List<Integer> keyList = new ArrayList(keySet);
        for (int thisDvdId : keyList) {
            DVD thisDVD = new DVD(thisDvdId);
            if (thisDVD.getAge() > dvdMaxAge) {
                dvdMaxAge = thisDVD.getAge();
                newest = library.get(thisDvdId);
            }
        }
        return newest;
        
    }

    @Override
    public double findAverageNotes() {
        return library.values().stream()
                .mapToLong(DVD::getNumberComments)
                .average()
                .getAsDouble();
    }

    @Override
    public int readCounter() throws FileNotFoundException {
        Scanner sc  = new Scanner(new BufferedReader(new FileReader(COUNTER_FILE)));
        String currentLine;
        while(sc.hasNextLine()){
            currentLine = sc.nextLine();
            counter = Integer.parseInt(currentLine);
        }
        sc.close();
        return counter;
    }

    @Override
    public void writeCounter() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(COUNTER_FILE));
        out.println(counter);
        out.flush();
        out.close();
    }

    @Override
    public DVD setDVDid() throws FileNotFoundException, IOException{
         counter = readCounter();
        DVD output = new DVD(counter);
        counter++;
        writeCounter();
        return output;
    }

}
