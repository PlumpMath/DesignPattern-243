package state;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class State {
    String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void method1() {
        System.out.println("this is method1");
    }

    public void method2() {
        System.out.println("this is method2");
    }
}
