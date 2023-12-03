import java.util.Scanner;

public class Calculator {
    int numberOne;
    int numberTwo;
    int numberThree;
    Calculator calc;
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("<--------End of fn-------->");
    }

    Calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert number between 1 to 4 (i.e: 1 for add, 2 for sub, 3 for mult, and 4 for div :)");
        numberThree = sc.nextInt();     //for choice
        System.out.println("Please insert 2 numbers :");
        System.out.print("Numbers 1: ");
        numberOne = sc.nextInt();
        System.out.print("Numbers 2: ");
        numberTwo = sc.nextInt();

        calc = new Calculator(numberOne, numberTwo);
        switch (numberThree) {
            case 1:
                calc.add();
                break;
            case 2:
                calc.sub();
                break;
            case 3:
                calc.mult();
                break;
            case 4:
                calc.div();
                break;
            default:
                System.out.println("First input out of bound");
                break;
        }
        sc.close();
    }

    Calculator(int num1, int num2) {
        numberOne = num1;
        numberTwo = num2;
    }

    void add() {
        System.out.print(numberOne+" & "+numberTwo+"  addition: ");
        System.out.println(numberOne + numberTwo);
    }

    void sub() {
        System.out.print(numberOne+" & "+numberTwo+"  subtraction : ");
        System.out.println(numberOne - numberTwo);
    }

    void mult() {
        System.out.print(numberOne+" & "+numberTwo+"  multiplication : ");
        System.out.println(numberOne * numberTwo);
    }

    void div() {
        System.out.print(numberOne+" & "+numberTwo+"  division : ");
        float value = numberOne;
        value /= numberTwo;
        System.out.println(value);
    }
}
