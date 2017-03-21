package adapter.interfaceAdapter;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable sourceA = new SourceSubA();
        Sourceable sourceB = new SourceSubB();
        sourceA.methodA();
        sourceA.methodB();
        sourceB.methodA();
        sourceB.methodB();
    }
}
