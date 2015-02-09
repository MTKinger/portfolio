package com.swcguild.serverinventory.controller;

import com.swcguild.serverinventory.dao.ServerDao;
import com.swcguild.serverinventory.dto.Server;
import com.swcguild.serverinventory.ui.UserIO;
import java.time.LocalDate;

public class ServerController {
    
    ServerDao dao;
    UserIO io;
    
    public ServerController(ServerDao dao, UserIO io){
    this.dao = dao;
    this.io = io;
    }
    
    public void run(){
        int choice;
        do{
        printMenu();
        choice = io.getInt("Please enter a menu choice:", 1, 3);
        switch(choice){
            case 1:
               this.addServer();
                break;
            case 2:
                this.getServerByName();
                break;
            case 3:
                io.printMessage("Goodbye!");
                break;
            default:
                io.printMessage("Invalid menu choice");
        }
        }while(choice !=3);
    }
    
    private void printMenu(){
        io.printMessage("1. Add a server");
        io.printMessage("2. Get server by name");
        io.printMessage("3. Exit");
        io.printMessage("");
    }
    
    private void addServer(){
        Server serverToBeAdded = new Server();
        serverToBeAdded.setName(io.getString("Please enter the name of the server:"));
        serverToBeAdded.setIp(io.getString("Please enter the server's IP address: "));
        serverToBeAdded.setManufacturer(io.getString("Please enter the server's manufacturer: "));
        serverToBeAdded.setRam(io.getString("Please enter the RAM of the server: "));
        serverToBeAdded.setNumProcessors(io.getInt("Please enter the number of processors for this server: "));
        serverToBeAdded.setPurchaseDate(io.getIsoDate("Please enter the purchase date for the server (YYYY-MM-DD) : "));
        
        dao.addServer(serverToBeAdded);
        
        io.getString("Server Added. \nPlease press any key to return to the Main Menu.");
    }
    
    private void getServerByName(){
        
        String serverName = io.getString("Please enter the name of the server you wish to find: ");
        Server thisServer = dao.getServerByName(serverName);
        
        if(thisServer == null){
            io.printMessage("There is no server in the database by that name...");
        }
        else{
        io.printMessage(thisServer.getName());
        io.printMessage(thisServer.getIp());
        io.printMessage(thisServer.getManufacturer());
        io.printMessage(thisServer.getRam());
        
        io.getString("\nPlease press any key to return to the main menu...");
        }
    }
}
