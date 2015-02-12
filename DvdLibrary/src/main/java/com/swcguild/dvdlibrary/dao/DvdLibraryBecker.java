package com.swcguild.dvdlibrary.dao;

import com.swcguild.dvdlibrary.dto.Dvd;
import java.util.ArrayList;
import java.util.List;

public class DvdLibraryBecker implements DvdLibraryDao{
    
     List<Dvd> dvdList = new ArrayList<>();
   
    @Override
    public void add(Dvd dvd) {
        dvdList.add(dvd);
    }

    @Override
    public void remove(Dvd dvd) {
        dvdList.remove(dvd);
    }

    @Override
    public List<Dvd> listAll() {
        return dvdList;
    }

    @Override
    public List<Dvd> getByTitle(String title) {

        ArrayList<Dvd> dvdByTitle = new ArrayList<>();

        for (Dvd currentDvd : dvdList) {
            if (title == currentDvd.getTitle()) {

                dvdByTitle.add(currentDvd);
            }
        }
        return dvdByTitle;

//        String searchTitle = title;
//dvdList
//.stream()
//.filter(s -> s.getTitle().equalsIgnoreCase(make))
//.forEach(e -> System.out.println(e.getName()));
    }

    @Override
    public List<Dvd> getByRating(String rating) {
        ArrayList<Dvd> dvdByRating = new ArrayList<>();

        for (Dvd currentDvd : dvdList) {
            if (rating == currentDvd.getMpaaRating()) {
                dvdByRating.add(currentDvd);
            }
        }
        return dvdByRating;
    }

    @Override
    public List<Dvd> getByStudio(String studio) {
        ArrayList<Dvd> dvdByStudio = new ArrayList<>();
        for (Dvd currentDvd : dvdList) {
            if (studio == currentDvd.getStudio()) {
                dvdByStudio.add(currentDvd);
            }
        }
        return dvdByStudio;
    }

}
