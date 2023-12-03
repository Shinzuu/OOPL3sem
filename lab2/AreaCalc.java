import java.util.Scanner;

public class AreaCalc {
    int numberOne;
    int numberTwo;
    
    AreaCalc(){
        Scanner sc = new Scanner(System.in);
        numberOne =  sc.nextInt();

        area = new AreaCalc(numberOne);
    }
    AreaCalc(int r){
        this.rad = r;
        System.out.println(3.1416*r*r);
    }
    AreaCalc(int h, int b){
        this.height = h;
        this.base = b;
        System.out.println(0.5*height*base);
    }
    AreaCalc(int x, int y){
        this.height = h;
        this.base = b;
        System.out.println(0.5*height*base);
    }
    AreaCalc(int x){
        this.height = h;
        this.base = b;
        System.out.println(0.5*height*base);
    }
    public static void main(String[] args) {
        AreaCalc a1 =new AreaCalc();
    }
}
