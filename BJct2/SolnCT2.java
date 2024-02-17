public class SolnCT2 {
    public static void main(String[] args) {
        Circle cx = new Circle();
        Triangle tx = new Triangle();
        Rectangle rx = new Rectangle();
        Square sx = new Square();

        cx.draw();
        tx.draw();
        rx.draw();
        sx.draw();
    }

    public static class Polygon {
        public void draw() {
            System.out.println("Drawing polygon");
        }
    }

    public static class Circle extends Polygon {
        @Override
        public void draw() {
            System.out.println("Drawing circle");
        }
    }

    public static class Triangle extends Polygon {
        @Override
        public void draw() {
            System.out.println("Drawing triangle");
        }
    }

    public static class Rectangle extends Polygon {
        @Override
        public void draw() {
            System.out.println("Drawing rectangle");
        }
    }

    public static class Square extends Polygon {
        @Override
        public void draw() {
            System.out.println("Drawing square");
        }
    }
}
