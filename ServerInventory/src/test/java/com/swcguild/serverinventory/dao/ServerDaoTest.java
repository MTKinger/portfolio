/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.dao;

import com.swcguild.serverinventory.dto.Server;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class ServerDaoTest {

    ServerDao dao;
    Server s1;
    Server s2;
    Server s3;
    Server s4;
    
    public ServerDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dao = new ServerDaoInMemImpl();
        
        s1 = new Server();
        s1.setName("web01");
        s1.setManufacturer("Dell");
        s1.setIp("192.168.1.1");
        s1.setNumProcessors(8);
        s1.setRam("8GB");
        s1.setPurchaseDate(LocalDate.parse("2000-01-01"));
        
        s2 = new Server();
        s2.setName("db01");
        s2.setManufacturer("Dell");
        s2.setIp("192.168.21.1");
        s2.setNumProcessors(16);
        s2.setRam("8GB");
        s2.setPurchaseDate(LocalDate.parse("2005-01-01"));
        
        s3 = new Server();
        s3.setName("hr124");
        s3.setManufacturer("HP");
        s3.setIp("192.168.1.100");
        s3.setNumProcessors(16);
        s3.setRam("8GB");
        s3.setPurchaseDate(LocalDate.parse("2005-01-01"));
        
        s4 = new Server();
        s4.setName("eng64");
        s4.setManufacturer("IBM");
        s4.setIp("192.168.100.100");
        s4.setNumProcessors(24);
        s4.setRam("64GB");
        s4.setPurchaseDate(LocalDate.parse("2010-01-01"));
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void addGetRemoveTest() {
        dao.addServer(s1);
        assertEquals(dao.getAllServers().size(), 1);
        Server actualResult = dao.getServerByName(s1.getName());
        assertEquals(s1, actualResult);
        dao.removeServer(s1.getName());
        assertEquals(dao.getAllServers().size(), 0);
        actualResult = dao.getServerByName(s1.getName());
        assertNull(actualResult);
    }
    
    @Test
    public void updateTest() {
        dao.addServer(s1);
        s1.setManufacturer("New Manufacturer");
        s1.setIp("New IP");
        s1.setNumProcessors(27);
        s1.setRam("0GB");
        s1.setPurchaseDate(LocalDate.MIN);
        dao.updateServer(s1);
        Server actualResult = dao.getServerByName(s1.getName());
        assertEquals(s1, actualResult);
    }
    
    @Test
    public void getAllServersTest() {
        assertEquals(dao.getAllServers().size(), 0);
        dao.addServer(s1);
        assertEquals(dao.getAllServers().size(), 1);
        dao.addServer(s2);
        assertEquals(dao.getAllServers().size(), 2);
        dao.addServer(s3);
        assertEquals(dao.getAllServers().size(), 3);
        dao.addServer(s4);
        assertEquals(dao.getAllServers().size(), 4);
        List<Server> actualResult = dao.getAllServers();
        List<Server> expectedResult = new ArrayList<>();
        expectedResult.add(s1);
        expectedResult.add(s2);
        expectedResult.add(s3);
        expectedResult.add(s4);
        
        Collections.sort(actualResult);
        Collections.sort(expectedResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void getServersByManufacturerTest() {
        dao.addServer(s1);
        dao.addServer(s2);
        dao.addServer(s3);
        dao.addServer(s4);
        
        List<Server> dellServers = new ArrayList<>();
        dellServers.add(s1);
        dellServers.add(s2);
        List<Server> actualResult = dao.getServersByManufacturer(s1.getManufacturer());
        Collections.sort(actualResult);
        Collections.sort(dellServers);
        assertEquals(dellServers, actualResult);
        
        actualResult = dao.getServersByManufacturer(s3.getManufacturer());
        List<Server> hpServer = new ArrayList<>();
        hpServer.add(s3);
        Collections.sort(actualResult);
        Collections.sort(hpServer);
        assertEquals(hpServer, actualResult);
        
        actualResult = dao.getServersByManufacturer("IBM");
        List<Server> ibmServer = new ArrayList<>();
        ibmServer.add(s4);
        Collections.sort(ibmServer);
        Collections.sort(actualResult);
        assertEquals(ibmServer, actualResult);
    }
    
}
