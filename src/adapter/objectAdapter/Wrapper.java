package adapter.objectAdapter;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Wrapper implements Targetable{
    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void methodA() {
        source.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("this is methodB");
    }
}
