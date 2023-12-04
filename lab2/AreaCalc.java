import java.util.Scanner;

public class AreaCalc {
    int radius;
    int height;
    int base;

    // Default constructor to get user input for radius
    AreaCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = sc.nextInt();
        sc.close();

        calculateArea(radius);
    }

    // Constructor for circle
    AreaCalc(int r) {
        this.radius = r;
        calculateArea(radius);
    }

    // Constructor for triangle
    AreaCalc(int h, int b) {
        this.height = h;
        this.base = b;
        calculateArea(0.5 * height * base);
    }

    // Constructor for rectangle
    AreaCalc(int length, int width) {
        this.height = length;
        this.base = width;
        calculateArea(height * base);
    }

    // Method to calculate and print the area
    private void calculateArea(double area) {
        System.out.println("The area is: " + area);
    }

    public static void main(String[] args) {
        // Creating an object of AreaCalc using the default constructor
        AreaCalc a1 = new AreaCalc();

        // Creating objects for specific shapes
        AreaCalc circle = new AreaCalc(5);
        AreaCalc triangle = new AreaCalc(4, 8);
        AreaCalc rectangle = new AreaCalc(6, 10);
    }
}

