package com.swcguild.masteryproject;

import BuisnessLogic.ManagementController;
import java.io.FileNotFoundException;
import java.io.IOException;




public class App {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ManagementController mc = new ManagementController();
        mc.run();
    }

}
