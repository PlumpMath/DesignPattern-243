package factoryMethod.SimpleFactory;

/**
 * Created by sdt14096 on 2017/3/16.
 */
public class SimpleFactory {
    public Product produce(String name) throws Exception {
        if ("product1".equals(name)) {
            return new ConcreteProduct1();
        } else if ("product2".equals(name)) {
            return new ConcreteProduct2();
        } else {
            throw new Exception("wrong name");
        }
    }
}
