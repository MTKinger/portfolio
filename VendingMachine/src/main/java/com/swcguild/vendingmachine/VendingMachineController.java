package com.swcguild.vendingmachine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VendingMachineController {
    
    
    @RequestMapping(value={"/vendingMachine"}, method=RequestMethod.GET)
    public String displayVendingMachine() {
        return "vendingMachine";
    }
    
    

}
