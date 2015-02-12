package com.swcguild.serverinventory;

import com.swcguild.serverinventory.dto.Server;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {
    
    public static void main(String[] args) {
        List<Server> sList = new ArrayList<>();
        
        Server s = new Server();
        s.setName("web01");
        s.setIp("192.168.1.1");
        s.setManufacturer("Dell");
        s.setRam("8GB");
        s.setNumProcessors(8);
        s.setPurchaseDate(LocalDate.parse("2010-01-01", DateTimeFormatter.ISO_DATE));
        
        sList.add(s);
        
        s = new Server();
        s.setName("db01");
        s.setIp("192.168.3.45");
        s.setManufacturer("HP");
        s.setRam("16GB");
        s.setNumProcessors(24);
        s.setPurchaseDate(LocalDate.parse("2013-01-01", DateTimeFormatter.ISO_DATE));
        
        sList.add(s);
        
        s = new Server();
        s.setName("hr124");
        s.setIp("192.168.32.111");
        s.setManufacturer("IBM");
        s.setRam("4GB");
        s.setNumProcessors(8);
        s.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        
        sList.add(s);
        
        s = new Server();
        s.setName("eng64");
        s.setIp("192.168.34.56");
        s.setManufacturer("HP");
        s.setRam("8GB");
        s.setNumProcessors(16);
        s.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        
        sList.add(s);
        
        // ** EXAMPLE  -  find all server for a given manufacturer
        // ** NOTE     -  we are ignoring case
        
        String make = "hp";
        String ram = "16GB";
        
        System.out.println("All " + make + " servers in invetory with " + ram + "GB of RAM:");
        
        
        // Lambda Expression  **More verbose, explicit way of writing the code. 
        
        /**sList
                .stream()
                .filter((Server myServer) -> {return myServer.getManufacturer().equalsIgnoreCase(make); })
                .forEach((Server currentServer) -> {System.out.println(currentServer.getName());});
        */
        
        //  Lambda Expression  **More streamlined version of the code above.
        
        sList
                .stream()
                
                //  NOTICE - no need to tell Servers, it is inferred.
                //  no need for the parentheses around the Server variable name
                //  no need for {} , return , or ;
                .filter(myServer ->  myServer.getManufacturer().equalsIgnoreCase(make))
                
                //  Added a second filter for fun
                .filter(hpServers -> hpServers.getRam().equalsIgnoreCase(ram))
                .forEach(currentServer -> System.out.println(currentServer.getName()));
        
        
       //  example - print out list of servers older than a given age
        
        long testAge  = 7;
        
        System.out.println("All server told than " + testAge + " years in inventory.");
        
        sList
                .stream()
                .filter(server -> server.getAge() > testAge)
                .forEach(server -> System.out.println(server.getName()));
        
        
        //  example return a LIST of servers older thaan a given age
        
        List<Server> oldServers = 
        sList
                .stream()
                .filter(server -> server.getAge() > testAge)
                .collect(Collectors.toList());
        
        System.out.println("Number of old servers = " + oldServers.size());
        
        oldServers.parallelStream().forEach(server -> System.out.println(server.getName()));
        
        //  example to calculate average age of the servers
        double avgAge =
        sList
                .stream()
                .mapToLong(server -> server.getAge())
                //  **OR** .mapToLong(Server::getAge)
                .average()
                .getAsDouble();
        
        System.out.println("\nAverage age of all servers in service: \n" + avgAge);
        
        
    }
    
    
    
    

}
