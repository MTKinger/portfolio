package BuisnessLogic;

public class CostCalculator implements Calculator {

        //**TESTED**
    @Override
    public double calculateMaterial(double area, double costPSF) {
        double materialCost = area * costPSF;
        return materialCost;
    }

    
        //**TESTED**
    @Override
    public double calculateLabor(double area, double laborPSF) {  //**TESTED**
        double laborCost = area * laborPSF;
        return laborCost;
    }

    
            //**TESTED**
    @Override
    public double calculateCost(double material, double labor) {  //**TESTED**
        double costBeforeTax = material + labor;
        return costBeforeTax;
    }

    
            //**TESTED**
    @Override
    public double calculateTax(double cost, double taxRate) {  //**TESTED**
        double tax = cost * (taxRate / 100);
        return tax;
    }

    
            //**TESTED**
    @Override
    public double calculateTotalCost(double tax, double cost) {  //**TESTED**
        double totalCost = tax + cost;
        return totalCost;
    }

}
