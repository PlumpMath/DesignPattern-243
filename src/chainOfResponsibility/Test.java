package chainOfResponsibility;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        MyHandler myHandler1 = new MyHandler("handler1");
        MyHandler myHandler2 = new MyHandler("handler2");
        MyHandler myHandler3 = new MyHandler("handler3");
        myHandler1.setHandler(myHandler2);
        myHandler2.setHandler(myHandler3);
        myHandler1.operation();
    }
}
