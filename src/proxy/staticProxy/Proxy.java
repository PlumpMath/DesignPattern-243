package proxy.staticProxy;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Proxy implements Sourceable {
    Sourceable source;

    public Proxy() {
        this.source = new Source();
    }

    private void before() {
        System.out.println("before method");
    }

    private void after() {
        System.out.println("after method");
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }
}
