import java.util.*;
// abstract class
abstract class Shapes{
    Scanner scn = new Scanner(System.in);
    //abtract method
    abstract void draw();
}


class Triangle extends Shapes{
    void draw() {
        System.out.println("To draw a Triangle insert  height and width : ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("'-->Drawing a Triangle of area "+(a*b*0.5)+" square unit");
    }
}
class Rectangle extends Shapes{
    void draw() {
        System.out.println("To draw a Rectangle insert  height and width : ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("'-->Drawing a Rectangle of area "+a*b+" square unit");
    }
}
class Circle extends Shapes{
    void draw() {
        System.out.println("To draw a Circle insert  radius : ");
        int r = scn.nextInt();
        System.out.println("'-->Drawing a Cicle of area "+(3.1416*r*r)+" square unit");
    }
}

public class TestShape{
    public static void main(String[] args){
        // System.out.println("main ran");
        Shapes t = new Triangle();
        Shapes r = new Rectangle();
        Shapes c = new Circle();

        t.draw();
        r.draw();
        c.draw();
    }
}