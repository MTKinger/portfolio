
package com.swcguild.serverinventory.dao;

import com.swcguild.serverinventory.dto.Server;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author warde
 */
public class ServerDaoInMemImpl implements ServerDao {
    private Map<String, Server> serverMap = new HashMap<>();

    @Override
    public void addServer(Server server) {
        serverMap.put(server.getName(), server);
    }

    @Override
    public Server getServerByName(String name) {
        return serverMap.get(name);
    }

    @Override
    public void removeServer(String name) {
        serverMap.remove(name);
    }

    @Override
    public void updateServer(Server server) {
        serverMap.put(server.getName(), server);
    }

    @Override
    public List<Server> getAllServers() {
        return new ArrayList<Server>(serverMap.values());
    }

    @Override
    public List<Server> getServersByManufacturer(String manufacturer) {
        return serverMap.values().stream()
                .filter(server -> server.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    @Override
    public List<Server> getServersOlderThan(int ageInYears) {
        return serverMap.values().stream()
                .filter(server -> server.getAge() > ageInYears)
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Server>> getServersOlderThanGroupByManufacturer(int ageInYears) {
        return serverMap.values().stream()
                .filter(server -> server.getAge() > ageInYears)
                .collect(Collectors.groupingBy(Server::getManufacturer));
    }

    @Override
    public double getAverageServerAge() {
        return serverMap.values().stream()
                .mapToLong(Server::getAge)
                .average()
                .getAsDouble();
    }

}
