public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        this.brand = brand;
        this.year = year;
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println(brand + " (" + year + ")");
        System.out.println("Has sidecar: " + hasSidecar);
    }
}
