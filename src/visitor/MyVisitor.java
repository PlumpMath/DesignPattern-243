package visitor;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("visit : " + subject.getSubject());
    }
}
