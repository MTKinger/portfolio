/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.dao;

import com.swcguild.serverinventory.dto.Server;
import java.util.List;
import java.util.Map;

/**
 *
 * @author warde
 */
public interface ServerDao {
    
    public void addServer(Server server);
    public Server getServerByName(String name);
    public void removeServer(String name);
    public void updateServer(Server server);
    public List<Server> getAllServers();
    public List<Server> getServersByManufacturer(String manufacturer);
    public List<Server> getServersOlderThan(int ageInYears);
    public Map<String, List<Server>> getServersOlderThanGroupByManufacturer(int ageInYears);
    public double getAverageServerAge();
    
}
