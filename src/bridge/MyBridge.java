package bridge;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class MyBridge extends Bridge {
    public void method() {
        getSource().method();
    }
}
