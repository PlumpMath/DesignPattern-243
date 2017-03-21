package interpreter;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context(5, 2);
        Expression plus = new Plus();
        System.out.println("plusNum : " + plus.interpret(context));
        Expression minus = new Minus();
        System.out.println("minusNum : " + minus.interpret(context));
    }
}
