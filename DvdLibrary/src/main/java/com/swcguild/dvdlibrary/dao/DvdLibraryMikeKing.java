package com.swcguild.dvdlibrary.dao;

import com.swcguild.dvdlibrary.dto.Dvd;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DvdLibraryMikeKing implements DvdLibraryDao{
    
    List<Dvd> library = new ArrayList<>();
    

    @Override
    public void add(Dvd dvd) {
        library.add(dvd);
    }

    @Override
    public void remove(Dvd dvd) {
        library.remove(dvd);
    }

    @Override
    public List<Dvd> listAll() {
        return library;
    }

    @Override
    public List<Dvd> getByTitle(String title) {
        return library.stream()
                .filter(dvd -> dvd.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getByRating(String rating) {
        return library.stream()
                .filter(dvd -> dvd.getMpaaRating().equalsIgnoreCase(rating))
                .collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getByStudio(String studio) {
        return library.stream()
                .filter(dvd -> dvd.getStudio().equalsIgnoreCase(studio))
                .collect(Collectors.toList());
    }
    
    

}
