import java.util.Scanner;

class Shape {
    protected String name;
    Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Rectangle extends Shape {
    protected int width;
    protected int height;

    Rectangle(String name,int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int width = sc.nextInt();
        int height = sc.nextInt();

        Rectangle rectangle = new Rectangle(name,width,height);

        System.out.println("Name: " + rectangle.getName());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());

    }
}
