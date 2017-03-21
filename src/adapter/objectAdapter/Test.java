package adapter.objectAdapter;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.methodA();
        wrapper.methodB();
    }
}
