package factoryMethod.SimpleFactory;

/**
 * Created by sdt14096 on 2017/3/16.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product1 = simpleFactory.produce("product1");
        Product product2 = simpleFactory.produce("product2");
        product1.describe();
        product2.describe();
    }
}
