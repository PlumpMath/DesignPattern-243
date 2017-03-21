package decorator;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        source.method();
        System.out.println("-----");
        decorator.method();
    }
}
