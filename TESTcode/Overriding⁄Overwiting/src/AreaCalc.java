//program that uses constructor overloading to calculate the are of   
//triangle , circle and rectangle .
//input 2 , input 1 and input 2 .(as parameters)
//3 constructors for 3 area calculations and 1 for input/output. 

//this is the class that encapsulate the program as a whole  
import java.util.*;

public class AreaCalc {
	int value; //for selection
	int radius;	//for circle
	int base;	//for triangle 
	int height;	//for triangle 
	int width;	//for rectangle
	int length;	//for rectangle
	//constructor default
	AreaCalc() {
		System.out.println("Select what type of shape you want to calculate the area of .");
		System.out.print("Choose 1 for circle, 2 for triangle and 3 for rectangle: ");
		Scanner scn = new Scanner(System.in);
		int value =  scn.nextInt();
		
		//switches between shapes
		switch (value) {
        case 1:
            //circle
        	int radius = scn.nextInt();
        	AreaCalc c0= new AreaCalc(radius);
            break;
        case 2:
            //triangle
        	int base = scn.nextInt();
        	int height = scn.nextInt();
        	AreaCalc c1= new AreaCalc(base, height);
            break;
        case 3:
            //rectangle
        	int width = scn.nextInt();
        	int length = scn.nextInt();
        	AreaCalc c2= new AreaCalc(width, length);
            break;
        default:
            System.out.println("Input out of bound");
            break;
		}
		scn.close();
		
	}
	//constructor for circle
	AreaCalc (int radius){
		this.radius = radius;
		System.out.println("the area of circle is "+(3.1416*radius*radius));
	}
	//even tho the constructor names are same (current and previous) , we have different parameters ,thus they are being overloaded
	AreaCalc (int base, int height){
		this.base = base;
		this.height = height;
		System.out.println("the area of triangle is "+(0.5*base*height));
	}
	// in this case the parameter of this constructor and the pervious one is same .so instead of it being overridden , its getting
	// overwritten , thus giving us wrong answer. for it to work properly we need to use method instead of constructor since 
	//both has 2 parameters .
	AreaCalc (int width, int length){
		this.width = width;
		this.length = length;
		System.out.println("the area of ractangle is "+(width*length));
	}
	
	// main fn that sends start instruction 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalc c1 = new AreaCalc();	
	}

}
