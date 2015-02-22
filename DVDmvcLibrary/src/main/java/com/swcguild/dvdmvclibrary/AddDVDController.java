package com.swcguild.dvdmvclibrary;

import com.swcguild.dvdmvclibrary.dao.DVDLibraryDao;
import com.swcguild.dvdmvclibrary.dto.DVD;
import java.util.List;
import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class AddDVDController {

    private DVDLibraryDao dao;

    @Inject
    public AddDVDController(DVDLibraryDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "addDVD", method = RequestMethod.GET)
    public String displayAddPage() {
        return "addDVD";
    }

    @RequestMapping(value = "/dvd", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public DVD createDVD(@RequestBody DVD dvd) {
        dao.addDVD(dvd);
        return dvd;
    }

    @RequestMapping(value = "/dvds", method = RequestMethod.GET)
    @ResponseBody
    public List<DVD> getAllDVD() {
        return dao.getAllDVD();
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.GET)
    @ResponseBody
    public DVD getDVD(@PathVariable int id) {
        return dao.getDVDById(id);
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDVD(@PathVariable("id") int id, @RequestBody DVD dvd) {
        dvd.setDvdId(id);
        dao.editDVD(dvd);
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDVD(@PathVariable("id") int id) {
        dao.removeDVD(id);
    }

}
