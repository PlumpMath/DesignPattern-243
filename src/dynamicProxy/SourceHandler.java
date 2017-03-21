package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by PoliceUncle on 2017/3/17.
 */
public class SourceHandler implements InvocationHandler {
    Object source;

    public SourceHandler(Object source){
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        if ("method".equals(method.getName())) {
            System.out.println("method begin");
            result = method.invoke(source, args);
            System.out.println("method end");
        } else {
            System.out.println("other method");
            result =method.invoke(source, args);
        }
        return result;
    }

    public static Object getSourceProxy(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new SourceHandler(object));
    }
}
