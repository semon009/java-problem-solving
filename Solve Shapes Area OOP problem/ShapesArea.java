/**
 * Problem Description:
 * We have a base class `Shape` with a method `area()`. 
 * There are four subclasses: `Triangle`, `Circle`, `Square`, and `Rectangle`.
 * The goal is to override the `area()` method in all subclasses to calculate 
 * and return the correct area for each specific shape using their respective fields.
 */

class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    @Override
    public double area() {
        return (height * base) / 2;
    }
}

class Circle extends Shape {
    double radius;
    
    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}

class Square extends Shape {
    double side;

    @Override
    public double area() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    @Override
    public double area() {
        return width * height;
    }
}
