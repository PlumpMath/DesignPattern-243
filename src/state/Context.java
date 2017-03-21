package state;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Context {
    State state;

    public Context(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();
        }
    }
}
