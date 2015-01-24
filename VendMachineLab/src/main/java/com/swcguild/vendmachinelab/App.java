package com.swcguild.vendmachinelab;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        MachineController mc = new MachineController();
        MachineInventory mi = new MachineInventory();
        mi.restockMachine();
        mc.run();
    }
}
