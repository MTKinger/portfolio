package com.swcguild.masteryproject.app;

import com.swcguild.masteryproject.businesslogic.ManagementController;
import java.io.FileNotFoundException;
import java.io.IOException;




public class App {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ManagementController mc = new ManagementController();
        mc.run();
    }

}
