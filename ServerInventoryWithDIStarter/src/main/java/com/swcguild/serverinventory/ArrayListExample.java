
package com.swcguild.serverinventory;

import com.swcguild.serverinventory.dto.Server;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 *
 * @author warde
 */
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
        
        // example - find all servers for a given manufacturer
        // note that we are ignoring case
        String make = "HP";
        System.out.println("All" + make +" servers in inventory:");
        
//        sList
//                .stream()
//                .filter((Server myServer) -> { return myServer.getManufacturer().equalsIgnoreCase(make); })
//                .forEach((Server currentServer) -> { System.out.println(currentServer.getName());});
        
        sList
                .stream()
                .filter(myServer -> myServer.getManufacturer().equalsIgnoreCase(make))
                .forEach(currentServer -> System.out.println(currentServer.getName()));
        
        // example - print all server names older than a given age
        long testAge = 7;
        System.out.println("All servers older than " + testAge + " years in inventory:");
        
        sList
                .stream()
                .filter(server -> server.getAge() > testAge)
                .forEach(server -> System.out.println(server.getName()));
        
        // example - get a list of all servers older than a given age
        List<Server> oldServers = 
        sList
                .stream()
                .filter(server -> server.getAge() > testAge)
                .collect(Collectors.toList());
        
        System.out.println("Num old servers = " + oldServers.size());
        
        oldServers.parallelStream().forEach(server -> System.out.println(server.getName()));
        
        // example calculate average age of servers in inventory
        double averageAge = sList
                .stream()
                .mapToLong(server -> server.getAge())
                .average()
                .getAsDouble();
        
        System.out.println("Average age of servers is " + averageAge + " years.");
        
        
        ArrayList<Integer> foo = new ArrayList<>();
        foo.add(10);
        foo.add(9);
        foo.add(8);
        
        int max = foo.stream().mapToInt(p -> p).max().getAsInt();
        
        System.out.println(max);

        
    }

}
