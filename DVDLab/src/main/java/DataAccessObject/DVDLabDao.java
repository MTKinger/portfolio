/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import DataTransferObject.DVD;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface DVDLabDao {

    public void writeLibrary()throws IOException;
    public void loadLibrary()throws FileNotFoundException;
    public int getLibrarySize();
    public void addDVD(DVD dvd);
    public void removeDVD(int dvd);
    public DVD getDVD(int dvdID);
    public List<DVD> getAllDVD();
    public List<DVD> getDVDByReleaseDate(int years);
    public List<DVD> getDVDByMPAA(String mpaa);
    public Map<String, List<DVD>> getDVDByDirector(String director);
    public List<DVD> getDVDByStudio(String studio);
    public double getAverageAge();
    public DVD findNewestDVD();
    public DVD findOldestDVD();
    public double findAverageNotes();
    public int readCounter()throws FileNotFoundException;
    public void writeCounter()throws IOException;
    public DVD setDVDid()throws FileNotFoundException, IOException;
    public void updateDVD(DVD dvd);
    
    
}
