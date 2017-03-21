package bridge;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        Bridge myBridge = new MyBridge();
        Sourceable subSource1 = new SubSource1();
        myBridge.setSource(subSource1);
        myBridge.method();
        Sourceable subSource2 = new SubSource2();
        myBridge.setSource(subSource2);
        myBridge.method();
    }
}
