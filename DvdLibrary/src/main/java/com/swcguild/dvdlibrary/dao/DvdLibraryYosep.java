package com.swcguild.dvdlibrary.dao;

import com.swcguild.dvdlibrary.dto.Dvd;
import java.util.ArrayList;
import java.util.List;

public class DvdLibraryYosep implements DvdLibraryDao{
    
    private List<Dvd> dvdList = new ArrayList<>();

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
        ArrayList<Dvd> dvdsByTitle = new ArrayList<>();

        dvdList.stream()
                .filter((currentDvd) -> (currentDvd.getTitle().contains(title)))
                .forEach((currentDvd) -> {
                    dvdsByTitle.add(currentDvd);
                });
        return dvdsByTitle;
    }

    @Override
    public List<Dvd> getByRating(String mpaaRating) {
        ArrayList<Dvd> dvdsByRating = new ArrayList<>();

        dvdList.stream()
                .filter((currentDVD) -> (currentDVD.getMpaaRating()
                .equals(mpaaRating))).forEach((currentDVD) -> {
                    dvdsByRating.add(currentDVD);
                });
        return dvdsByRating;
    }

    // Non-lambda implementation
    @Override
    public List<Dvd> getByStudio(String studio) {
        ArrayList<Dvd> dvdsByStudio = new ArrayList<>();

        for(Dvd currentDvd : dvdList) {
            if (currentDvd.getStudio().contains(studio)) {
                dvdsByStudio.add(currentDvd);
            }
        }
        return dvdsByStudio;
    }

}
