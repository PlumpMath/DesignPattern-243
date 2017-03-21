package abstractFactory;

/**
 * Created by sdt14096 on 2017/3/16.
 */
public class Product1Factory implements Factory {
    @Override
    public Product produce() {
        return new ConcreteProduct1();
    }
}
