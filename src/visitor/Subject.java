package visitor;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}
