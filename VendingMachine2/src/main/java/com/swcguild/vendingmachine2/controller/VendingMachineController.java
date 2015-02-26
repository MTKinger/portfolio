package com.swcguild.vendingmachine2.controller;

import com.swcguild.vendingmachine2.dao.ChangeDao;
import com.swcguild.vendingmachine2.dao.SnackDao;
import com.swcguild.vendingmachine2.dto.Change;
import com.swcguild.vendingmachine2.dto.Snack;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VendingMachineController {

    SnackDao snackDao;
    ChangeDao changeDao;
    
    @Inject
    public VendingMachineController(SnackDao snackDao, ChangeDao changeDao) {
        this.snackDao = snackDao;
        this.changeDao = changeDao;
    }

    @RequestMapping(value = {"/vendingMachine"}, method = RequestMethod.GET)
    public String displayVendingMachine() {
        return "vendingMachine";
    }
    
    @RequestMapping(value="/snacks", method=RequestMethod.GET)
    @ResponseBody public List<Snack> stockMachine(){
        return snackDao.getAllSnacks();
    }
    
    @RequestMapping(value="/change", method=RequestMethod.POST)
    @ResponseBody public Change insertChange(@RequestBody double moneyIn){
        return null;
    }

}
