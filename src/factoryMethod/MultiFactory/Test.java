package factoryMethod.MultiFactory;

/**
 * Created by sdt14096 on 2017/3/16.
 */
public class Test {
    public static void main(String[] args) {
        MultiMethodFactory multiMethodFactory = new MultiMethodFactory();
        Product product1 = multiMethodFactory.produceProduct1();
        Product product2 = multiMethodFactory.produceProduct2();
        product1.describe();
        product2.describe();
    }
}
