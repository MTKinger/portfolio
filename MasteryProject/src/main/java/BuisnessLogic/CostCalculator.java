package BuisnessLogic;

public class CostCalculator implements Calculator {

    @Override
    public double calculateMaterial(double area, double costPSF) {
        double materialCost = area * costPSF;
        return materialCost;
    }

    @Override
    public double calculateLabor(double area, double laborPSF) {
        double laborCost = area * laborPSF;
        return laborCost;
    }

    @Override
    public double calculateCost(double material, double labor) {
        double costBeforeTax = material + labor;
        return costBeforeTax;
    }

    @Override
    public double calculateTax(double cost, double taxRate) {
        double tax = cost*(taxRate/100);
        return tax;
    }

    @Override
    public double calculateTotalCost(double tax, double cost) {
        double totalCost = tax + cost;
        return totalCost;
    }

}
