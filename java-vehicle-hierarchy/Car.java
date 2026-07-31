public class Car extends Vehicle {
    int numDoors;

    public Car(String brand, int year, int numDoors) {
        this.brand = brand;
        this.year = year;
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println(brand + " (" + year + ")");
        System.out.println("Number of doors: " + numDoors);
    }
}
