package object_oriented.getter_setter.methods;

public class MyCar {
    private String color;
    private String model;
    private final Double FuelLevel;
    private final long costOfPurchase;

    // getter methods
    public  String getColor() {
        return color;
    }
    public  String getModel() {
        return model;
    }

    public  Double getFuelLevel() {
        return FuelLevel;
    }

    public  long getCostOfPurchase() {
        return costOfPurchase;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MyCar(String color, String model, Double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.FuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return STR."MyCar{color='\{color}', model='\{model}', FuelLevel=\{FuelLevel}, costOfPurchase=\{costOfPurchase}}";
    }
}
