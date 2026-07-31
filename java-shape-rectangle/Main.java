import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shapeName = scanner.nextLine();
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(shapeName, length, width);

        System.out.println(rectangle.name);
        System.out.println(rectangle.getArea());

        scanner.close();
    }
}
