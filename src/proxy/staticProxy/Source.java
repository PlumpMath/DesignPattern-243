package proxy.staticProxy;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is source method");
    }
}
