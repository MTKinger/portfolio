/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdmvclibrary.dao;

import com.swcguild.dvdmvclibrary.dto.DVD;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface DVDLibraryDao {
    
    public void addDVD(DVD dvd);
    public void removeDVD(int dvdId);
    public void editDVD(DVD dvd);
    public List<DVD> getAllDVD();
    public DVD getDVDById(int dvdId);
    public List<DVD> searchDVDs(Map<SearchTerm, String> criteria);
}
