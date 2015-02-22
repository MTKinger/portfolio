package com.swcguild.dvdmvclibrary.dao;

import com.swcguild.dvdmvclibrary.dto.DVD;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DVDLibraryDaoInMemImpl implements DVDLibraryDao{
    
    private Map<Integer, DVD> dvdLibrary = new HashMap<>();
    private static int dvdIdCounter = 0;

    @Override
    public void addDVD(DVD dvd) {
        dvd.setDvdId(dvdIdCounter++);
        dvdLibrary.put(dvd.getDvdId(), dvd);
    }

    @Override
    public void removeDVD(int dvdId) {
        dvdLibrary.remove(dvdId);
   }

    @Override
    public void editDVD(DVD dvd) {
        dvdLibrary.put(dvd.getDvdId(), dvd);
    }

    @Override
    public List<DVD> getAllDVD() {
        Collection<DVD> c = dvdLibrary.values();
        return new ArrayList(c);
    }

    @Override
    public DVD getDVDById(int dvdId) {
        return dvdLibrary.get(dvdId);
    }

    @Override
    public List<DVD> searchDVDs(Map<SearchTerm, String> criteria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    

}
