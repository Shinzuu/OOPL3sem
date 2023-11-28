package lab1;

public class TestCalculator {
    Calculator calc1, calc2;
    TestCalculator()
    {
        calc1 = new Calculator(4,8);
        calc2 = new Calculator(9,6);

        System.out.println("First two values:");
        calc1.add();
        calc1.sub();
        calc1.mult();
        calc1.div();

        System.out.println("Next two values:");
        calc2.add();
        calc2.sub();
        calc2.mult();
        calc2.div();
    }
    public static void main(String[] args){
        TestCalculator calc = new TestCalculator();
    }
}
