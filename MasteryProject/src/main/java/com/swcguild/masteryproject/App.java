package com.swcguild.masteryproject;

import BuisnessLogic.ManagementController;
import java.io.FileNotFoundException;




public class App {
    
    public static void main(String[] args) throws FileNotFoundException {
        ManagementController mc = new ManagementController();
        mc.run();
    }

}
