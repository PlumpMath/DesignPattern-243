package proxy.staticProxy;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable proxy = new Proxy();
        source.method();
        System.out.println("-----");
        proxy.method();
    }
}
