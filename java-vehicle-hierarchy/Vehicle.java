public class Vehicle {
    String brand;
    int year;

    public Vehicle() {}

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(brand + " (" + year + ")");
    }
}
