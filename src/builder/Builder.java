package builder;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public interface Builder {
    public void buildProduct();
    public void buildPartA();
    public void buildPartB();
    public void buildPartC();
    public Product getProduct();
}
