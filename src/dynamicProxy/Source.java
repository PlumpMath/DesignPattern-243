package dynamicProxy;

/**
 * Created by PoliceUncle on 2017/3/17.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("method");
    }
}
