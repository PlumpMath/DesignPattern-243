package strategy;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Plus implements ICalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
