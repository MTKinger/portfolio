
package com.swcguild.serverinventory.dto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author warde
 */
public class Server implements Comparable<Server> {
    private String name;
    private String ip;
    private String manufacturer;
    private String ram;
    private int numProcessors;
    private LocalDate purchaseDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getNumProcessors() {
        return numProcessors;
    }

    public void setNumProcessors(int numProcessors) {
        this.numProcessors = numProcessors;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    public long getAge() {
        Period p = purchaseDate.until(LocalDate.now());
        return p.getYears();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.ip);
        hash = 19 * hash + Objects.hashCode(this.manufacturer);
        hash = 19 * hash + Objects.hashCode(this.ram);
        hash = 19 * hash + this.numProcessors;
        hash = 19 * hash + Objects.hashCode(this.purchaseDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Server other = (Server) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ip, other.ip)) {
            return false;
        }
        if (!Objects.equals(this.manufacturer, other.manufacturer)) {
            return false;
        }
        if (!Objects.equals(this.ram, other.ram)) {
            return false;
        }
        if (this.numProcessors != other.numProcessors) {
            return false;
        }
        if (!Objects.equals(this.purchaseDate, other.purchaseDate)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Server o) {
        
        int result = this.getName().compareTo(o.getName());
        if (result != 0) {
            return result;
        } else {
            return this.getIp().compareTo(o.getIp());
        }
    }
}
