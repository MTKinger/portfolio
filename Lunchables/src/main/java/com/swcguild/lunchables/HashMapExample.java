package com.swcguild.lunchables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    
    public static void main(String[] args) {
        
        // Track Car Companies
        // Look up all car models, truck models, suv Models
        // Chevy, ford, dodge, toyota.
        // Cars Broken down by compact, midsize, fullsize.
        
       /** HashMap<String, CarCompany> allAutoMap = new HashMap<>();
        
        CarCompany ford = new CarCompany();
        ford.setCompanyName("Ford");
        ArrayList<Truck> fordTrucks = new ArrayList<>();
        ArrayList<Car> fordCars = new ArrayList<>();
        ArrayList<Suv> fordSuvs = new ArrayList<>();
        Truck truck = new Truck();
        Car car = new Car();
        Suv suv = new Suv();
        
        
        truck.setModelName("F-150");
        fordTrucks.add(truck);
        truck = new Truck();
        truck.setModelName("Super Duty");
        fordTrucks.add(truck);
        ford.setTrucks(fordTrucks);
        
        car.setModelName("Fiesta");
        car.setCarType("Compact");
        fordCars.add(car);
        car = new Car();
        car.setModelName("Focus");
        car.setCarType("Mid-Size");
        fordCars.add(car);
        car = new Car();
        car.setModelName("Fusion");
        car.setCarType("Mid-Size");
        fordCars.add(car);
        car = new Car();
        car.setModelName("Mustang");
        car.setCarType("Full");
        fordCars.add(car);
        car = new Car();
        car.setModelName("C-Max");
        car.setCarType("Compact");
        fordCars.add(car);
        car = new Car();
        car.setModelName("Focus");
        car.setCarType("Mid-Size");
        fordCars.add(car);
        car = new Car();
        car.setModelName("Taurus");
        car.setCarType("Full");
        fordCars.add(car);
        ford.setCars(fordCars);
        
        suv.setModelName("Explorer");
        fordSuvs.add(suv);
        suv = new Suv();
        suv.setModelName("Expedition");
        fordSuvs.add(suv);
        ford.setSuvs(fordSuvs);
        
        allAutoMap.put(ford.getCompanyName(), ford);
        
        
        CarCompany toyota = new CarCompany();
        toyota.setCompanyName("Toyota");
        ArrayList<Truck> toyotaTrucks = new ArrayList<>();
        ArrayList<Car> toyotaCars = new ArrayList<>();
        ArrayList<Suv> toyotaSuvs = new ArrayList<>();
        
        truck = new Truck();
        truck.setModelName("Tundra");
        toyotaTrucks.add(truck);
        truck = new Truck();
        truck.setModelName("Tacoma");
        toyotaTrucks.add(truck);
        toyota.setTrucks(toyotaTrucks);
        
        car = new Car();
        car.setModelName("Yaris");
        car.setCarType("Compact");
        toyotaCars.add(car);
        car = new Car();
        car.setModelName("Corolla");
        car.setCarType("Compact");
        toyotaCars.add(car);
        car = new Car();
        car.setModelName("Camry");
        car.setCarType("Mid-Size");
        toyotaCars.add(car);
        car = new Car();
        car.setModelName("Avalon");
        car.setCarType("Full");
        toyotaCars.add(car);
        toyota.setCars(toyotaCars);
        
        suv = new Suv();
        suv.setModelName("Rav-4");
        toyotaSuvs.add(suv);
        suv = new Suv();
        suv.setModelName("Highlander");
        toyotaSuvs.add(suv);
        toyota.setSuvs(toyotaSuvs);
        allAutoMap.put(toyota.getCompanyName(), toyota);
        
        CarCompany chevy = new CarCompany();
        chevy.setCompanyName("Chevrolet");
        ArrayList<Truck> chevyTrucks = new ArrayList<>();
        ArrayList<Car> chevyCars = new ArrayList<>();
        ArrayList<Suv> chevySuvs = new ArrayList<>();
        
        truck = new Truck();
        truck.setModelName("Colorado");
        chevyTrucks.add(truck);
        truck = new Truck();
        truck.setModelName("Silverado");
        chevyTrucks.add(truck);
        chevy.setTrucks(chevyTrucks);
        
        car = new Car();
        car.setModelName("Cruz");
        car.setCarType("Mid-Size");
        chevyCars.add(car);
        car = new Car();
        car.setModelName("Malibu");
        car.setCarType("Mid-Size");
        chevyCars.add(car);
        car = new Car();
        car.setModelName("Impala");
        car.setCarType("Full");
        chevyCars.add(car);
        car = new Car();
        car.setModelName("Sonic");
        car.setCarType("Compact");
        chevyCars.add(car);
        chevy.setCars(chevyCars);
        
        suv = new Suv();
        suv.setModelName("Tahoe");
        chevySuvs.add(suv);
        suv = new Suv();
        suv.setModelName("Suburban");
        chevySuvs.add(suv);
        chevy.setSuvs(chevySuvs);
        
        allAutoMap.put(chevy.getCompanyName(), chevy);
        
        
        
        CarCompany dodge = new CarCompany();
        dodge.setCompanyName("Dodge");
        ArrayList<Truck> dodgeTrucks = new ArrayList<>();
        ArrayList<Car> dodgeCars = new ArrayList<>();
        ArrayList<Suv> dodgeSuvs = new ArrayList<>();
        
        truck = new Truck();
        truck.setModelName("Ram");
        dodgeTrucks.add(truck);
        dodge.setTrucks(dodgeTrucks);
        
        car = new Car();
        car.setModelName("Dart");
        car.setCarType("Compact");
        dodgeCars.add(car);
        car = new Car();
        car.setModelName("Charger");
        car.setCarType("Full");
        dodgeCars.add(car);
        car = new Car();
        car.setModelName("Challenger");
        car.setCarType("Mid-Size");
        dodgeCars.add(car);
        
        dodge.setCars(dodgeCars);
        
        suv = new Suv();
        suv.setModelName("Durango");
        dodgeSuvs.add(suv);
        suv = new Suv();
        suv.setModelName("Caravan");
        dodgeSuvs.add(suv);
        
        dodge.setSuvs(dodgeSuvs);
        
        allAutoMap.put(dodge.getCompanyName(), dodge);
        
        Set<String> keySet = allAutoMap.keySet();
        for (String thisCompany : keySet){
            CarCompany currentCompany = allAutoMap.get(thisCompany);
            System.out.println("");
            System.out.println(currentCompany.getCompanyName());
            System.out.println("");
            System.out.println("-SUVs-");
            ArrayList<Suv> currentSUVs = currentCompany.getSuvs();
            for(Suv currentSuv : currentSUVs){
                System.out.println(currentSuv.getModelName());
            }
            System.out.println("");
            System.out.println("-Trucks-");
            ArrayList<Truck> currentTrucks = currentCompany.getTrucks();
            for(Truck currentTruck : currentTrucks){
                System.out.println(currentTruck.getModelName());
            }
            System.out.println("");
            System.out.println("-Cars-");
            ArrayList<Car> currentCars = currentCompany.getCars();
            for(Car currentCar : currentCars){
                System.out.print(currentCar.getModelName() + " - ");
                System.out.println(currentCar.getCarType());
            }
            
        }
    }*/
        
        Map<String,Map<String,List<String>>> carCompanies = new HashMap<>();
        List<String> chevyCars = new ArrayList<>();
        List<String> chevyTrucks = new ArrayList<>();
        List<String> chevySuvs = new ArrayList<>();
        
        chevyCars.add("Malibu");
        chevyCars.add("Cruz");
        chevyCars.add("Impala");
        
        chevyTrucks.add("Silverado");
        
        chevySuvs.add("TrailBlazer");
        
        Map<String, List<String>> chevyMap = new HashMap<>();
        
        chevyMap.put("Trucks", chevyTrucks);
        chevyMap.put("Cars", chevyCars);
        chevyMap.put("SUVs", chevySuvs);
        
        carCompanies.put("Chevy", chevyMap);
        
        System.out.println("Done");
        

}
}
