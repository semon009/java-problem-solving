public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
