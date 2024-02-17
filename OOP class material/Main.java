// Define the parent class Polygon
class Polygon {
    public void draw() {
        System.out.println("Drawing a polygon.");
    }
}

// Define the subclass Circle that inherits from Polygon
class Circle extends Polygon {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Define the subclass Triangle that inherits from Polygon
class Triangle extends Polygon {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

// Define the subclass Rectangle that inherits from Polygon
class Rectangle extends Polygon {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Define the subclass Square that inherits from Rectangle
class Square extends Rectangle {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects and demonstrate method overriding
        Polygon polygon = new Polygon();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        // Call the draw method for each shape
        polygon.draw();
        circle.draw();
        triangle.draw();
        rectangle.draw();
        square.draw();
    }
}
