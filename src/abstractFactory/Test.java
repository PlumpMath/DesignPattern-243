package abstractFactory;

/**
 * Created by sdt14096 on 2017/3/16.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory1 = new Product1Factory();
        Product product1 = factory1.produce();
        Factory factory2 = new Product2Factory();
        Product product2 = factory2.produce();
        product1.describe();
        product2.describe();
    }
}
