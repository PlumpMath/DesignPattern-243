package decorator;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Decorator implements Sourceable {
    Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
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
