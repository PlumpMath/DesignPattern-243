package strategy;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        ICalculator plus = new Plus();
        ICalculator minus = new Minus();
        ICalculator multiply = new Multiply();
        System.out.println("plus : " + plus.calculate(num1, num2));
        System.out.println("minus : " + minus.calculate(num1, num2));
        System.out.println("multiply : " + multiply.calculate(num1, num2));
    }
}
