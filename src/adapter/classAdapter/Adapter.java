package adapter.classAdapter;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void methodB() {
        System.out.println("this is methodB");
    }
}
