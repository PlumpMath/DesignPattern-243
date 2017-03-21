package interpreter;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
