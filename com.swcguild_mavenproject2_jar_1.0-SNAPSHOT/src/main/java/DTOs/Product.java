package DTOs;

public class Product extends Taxes{
    
    protected String productType;
    protected double costPSF;
    protected double laborPSF;

    public Product() {
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getCostPSF() {
        return costPSF;
    }

    public void setCostPSF(double costPSF) {
        this.costPSF = costPSF;
    }

    public double getLaborPSF() {
        return laborPSF;
    }

    public void setLaborPSF(double laborPSF) {
        this.laborPSF = laborPSF;
    }
    
    

}
