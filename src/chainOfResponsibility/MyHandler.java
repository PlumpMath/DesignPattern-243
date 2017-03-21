package chainOfResponsibility;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class MyHandler extends AbstractHandler implements Handler {
    String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + " : deal");
        if (getHandler() != null) {
            getHandler().operation();
        }
    }
}
