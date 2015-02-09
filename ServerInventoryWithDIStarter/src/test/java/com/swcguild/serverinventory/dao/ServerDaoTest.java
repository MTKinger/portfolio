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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author warde
 */
public class ServerDaoTest {
    
    Server s1;
    Server s2;
    Server s3;
    Server s4;
    ServerDao dao;
    
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
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = ctx.getBean("serverDao", ServerDao.class);
        
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
        assertEquals(1, dao.getAllServers().size());
        Server actualResult = dao.getServerByName(s1.getName());
        assertEquals(s1, actualResult);
        
        dao.removeServer(s1.getName());
        assertEquals(0, dao.getAllServers().size());
        actualResult = dao.getServerByName(s1.getName());
        assertNull(actualResult);
    }
    
    @Test
    public void updateTest() {
        dao.addServer(s1);
        
        s1.setManufacturer("NEW MANUFACTURER");
        s1.setIp("NEW IP");
        s1.setNumProcessors(10);
        s1.setRam("0GB");
        s1.setPurchaseDate(LocalDate.MIN);
        
        dao.updateServer(s1);
        Server actualResult = dao.getServerByName(s1.getName());
        assertEquals(s1, actualResult);
    }
    
    @Test
    public void getAllServersTest() {
        dao.addServer(s1);
        dao.addServer(s2);
        dao.addServer(s3);
        dao.addServer(s4);
        
        assertEquals(4, dao.getAllServers().size());
        
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
        List<Server> hpServers = new ArrayList<>();
        hpServers.add(s3);
        Collections.sort(hpServers);
        Collections.sort(actualResult);
        assertEquals(hpServers, actualResult);
        
        actualResult = dao.getServersByManufacturer(s4.getManufacturer());
        List<Server> ibmServers = new ArrayList<>();
        ibmServers.add(s4);
        Collections.sort(ibmServers);
        Collections.sort(actualResult);
        assertEquals(ibmServers, actualResult);
        
        
    }
    
    
}
