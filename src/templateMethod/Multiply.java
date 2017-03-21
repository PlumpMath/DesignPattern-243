package templateMethod;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Multiply extends AbCalculator {
    @Override
    public int calculate(int[] nums) {
        int sum = 1;
        for (int num : nums) {
            sum = num * sum;
        }
        return sum;
    }
}
