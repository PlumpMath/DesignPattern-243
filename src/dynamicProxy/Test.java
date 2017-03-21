package dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by PoliceUncle on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable proxy = (Sourceable) SourceHandler.getSourceProxy(source);
        source.method();
        System.out.println("------");
        proxy.method();
    }
}
