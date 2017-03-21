package templateMethod;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public abstract class AbCalculator {
    public final int calculatePol(String poly) {
        String[] numStrings = poly.split("\\.");
        int[] nums = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i]);
        }
        return calculate(nums);
    }

    public abstract int calculate(int[] nums);
}
