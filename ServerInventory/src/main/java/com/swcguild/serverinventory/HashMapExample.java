package com.swcguild.serverinventory;

import com.swcguild.serverinventory.dto.Server;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
   
    public static void main(String[] args) {
        
        Map<String, Server> serverMap = new HashMap<>();
        
        Server s = new Server();
        s.setName("web01");
        s.setIp("192.168.1.1");
        s.setManufacturer("Dell");
        s.setRam("8GB");
        s.setNumProcessors(8);
        s.setPurchaseDate(LocalDate.parse("2010-01-01", DateTimeFormatter.ISO_DATE));
        
        serverMap.put(s.getName(), s);
        
        s = new Server();
        s.setName("db01");
        s.setIp("192.168.3.45");
        s.setManufacturer("HP");
        s.setRam("16GB");
        s.setNumProcessors(24);
        s.setPurchaseDate(LocalDate.parse("2013-01-01", DateTimeFormatter.ISO_DATE));
        
        serverMap.put(s.getName(), s);
        
        s = new Server();
        s.setName("hr124");
        s.setIp("192.168.32.111");
        s.setManufacturer("IBM");
        s.setRam("4GB");
        s.setNumProcessors(8);
        s.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        
        serverMap.put(s.getName(), s);
        
        s = new Server();
        s.setName("eng64");
        s.setIp("192.168.34.56");
        s.setManufacturer("HP");
        s.setRam("8GB");
        s.setNumProcessors(16);
        s.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        
        serverMap.put(s.getName(), s);
        
        //  **print the names of all the servers from HP**
        
        String make = "hp";
        
        System.out.println("\nCurrent HP servers in use: \n");
        
        serverMap.values()
                .stream()
                .filter(server -> server.getManufacturer().equalsIgnoreCase(make))
                .forEach(server -> System.out.println(server.getName()));
        
        
        
    }

}
