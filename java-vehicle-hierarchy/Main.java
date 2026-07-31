import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vehicleType = scanner.nextLine();
        String brand = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());

        if (vehicleType.equals("Car")) {
            int numDoors = Integer.parseInt(scanner.nextLine());
            Car car = new Car(brand, year, numDoors);
            car.displayInfo();
        } else if (vehicleType.equals("Motorcycle")) {
            boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());
            Motorcycle motorcycle = new Motorcycle(brand, year, hasSidecar);
            motorcycle.displayInfo();
        }

        scanner.close();
    }
}
