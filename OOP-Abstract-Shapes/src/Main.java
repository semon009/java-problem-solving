import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double radius = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        Circle circle = new Circle(radius);

        System.out.println(rectangle.area());
        System.out.println(circle.area());

        scanner.close();
    }
}
