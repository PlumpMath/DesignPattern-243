package visitor;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Test {
    public static void main(String[] args) {
        Subject mySub = new MySubject();
        Visitor visitor = new MyVisitor();
        mySub.accept(visitor);
    }
}
