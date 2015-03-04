package com.swcguild.dvdmvclibrary.dao;

import com.swcguild.dvdmvclibrary.dto.DVD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class DVDLibraryDbImpl implements DVDLibraryDao{
    
    private static final String SQL_INSERT_DVD
            ="INSERT INTO dvds (title, release_year, rating, director, studio, comments) "
            + " values (?,?,?,?,?,?)";
    
    private static final String SQL_SELECT_DVD
            ="SELECT * FROM dvds WHERE dvd_id = ?";
    
    private static final String SQL_SELECT_ALL_DVDS
            ="SELECT * FROM dvds";
    
    private static final String SQL_UPDATE_DVD
            ="UPDATE dvds SET title = ?, release_year = ?, rating = ?, director = ?, studio = ?, comments = ?"
            + " WHERE dvd_id = ?";
    
    private static final String SQL_DELETE_DVD
            ="DELETE FROM dvds WHERE dvd_id = ?";
    
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addDVD(DVD dvd) {
        jdbcTemplate.update(SQL_INSERT_DVD,
                dvd.getTitle(),
                dvd.getReleaseYear(),
                dvd.getRating(),
                dvd.getDirector(),
                dvd.getStudio(),
                dvd.getComments());
        dvd.setDvdId(jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class));
    }

    @Override
    public void removeDVD(int dvdId) {
        jdbcTemplate.update(SQL_DELETE_DVD, dvdId);
    }

    @Override
    public void editDVD(DVD dvd) {
        jdbcTemplate.update(SQL_UPDATE_DVD,
                dvd.getTitle(),
                dvd.getReleaseYear(),
                dvd.getRating(),
                dvd.getDirector(),
                dvd.getStudio(),
                dvd.getComments(),
                dvd.getDvdId());
    }

    @Override
    public List<DVD> getAllDVD() {
        return jdbcTemplate.query(SQL_SELECT_ALL_DVDS, new DVDMapper());
    }

    @Override
    public DVD getDVDById(int dvdId) {
        try{
        return jdbcTemplate.queryForObject(SQL_SELECT_DVD, new DVDMapper(), dvdId);
                }catch(EmptyResultDataAccessException ex){
                    return null;
                }
    }

    @Override
    public List<DVD> searchDVDs(Map<SearchTerm, String> criteria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final class DVDMapper implements ParameterizedRowMapper<DVD>{

        @Override
        public DVD mapRow(ResultSet rs, int i) throws SQLException {
            DVD dvd = new DVD();
            dvd.setDvdId(rs.getInt("dvd_id"));
            dvd.setTitle(rs.getString("title"));
            dvd.setReleaseYear(rs.getString("release_year"));
            dvd.setRating(rs.getString("rating"));
            dvd.setDirector(rs.getString("director"));
            dvd.setStudio(rs.getString("studio"));
            dvd.setComments(rs.getString("comments"));
            return dvd;
        }
        
    }
    
    

}
