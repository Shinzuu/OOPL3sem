public class Calculator {
    int numberOne;
    int numberTwo;
    Calculator(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    void add(){
        System.out.print("  addition: ");
        System.out.println(numberOne+numberTwo);
    }
    void sub(){
        System.out.print("  substraction : ");
        System.out.println(numberOne-numberTwo);
    }
    void mult(){
        System.out.print("  multiplication : ");
        System.out.println(numberOne*numberTwo);
    }
    void div(){
        System.out.print("  divition : ");
        float value = numberOne;
        value/=numberTwo;
        System.out.println(value);
    }
    // for when solo calc is needed to be used
    // public static void main(String[] args){
    //     Calculator calc1 = new Calculator(6,6);
    //     Calculator calc2 = new Calculator(9,6);
    //     calc1.add();
    //     calc1.sub();

    //     calc2.add();
    //     calc2.sub();

    // }
}
