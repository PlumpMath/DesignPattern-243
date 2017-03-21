package adapter.classAdapter;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.methodA();
        target.methodB();
    }
}
