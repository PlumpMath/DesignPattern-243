package templateMethod;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        AbCalculator plus = new Plus();
        int sum = plus.calculatePol("3.4.5.6.7");
        System.out.println("sum : " + sum);
        AbCalculator multiply = new Multiply();
        int product = multiply.calculatePol("3.4.5.6.7");
        System.out.println("product : " + product);
    }
}
