package visitor;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "mySubject";
    }
}
