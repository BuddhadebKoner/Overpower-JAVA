package object_oriented.accessModifires.buddhaCar;

public class buddhaCar {
    public String color;
    public float currentFule;
    public float maxSpeed;
    // private attribute can't be accessed from outside the package
    private String brand;
    String costOFcar = "1000000";

    public buddhaCar() {
        this.color = "White";
        this.currentFule = 0;
        this.maxSpeed = 0;
        this.brand = "Auto";
    }

  public buddhaCar(String color, float currentFule, float maxSpeed, String brand) {
        this.color = color;
        this.currentFule = currentFule;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return STR."buddhaCar{color='\{color}', currentFule=\{currentFule}, maxSpeed=\{maxSpeed}, brand='\{brand}'}";
    }
}
