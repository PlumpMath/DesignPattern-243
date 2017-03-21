package factoryMethod.staticMethodFactory;

/**
 * Created by sdt14096 on 2017/3/16.
 */
public class Test {
    public static void main(String[] args) {
        Product product1 = StaticMethodFactory.produceProduct1();
        Product product2 = StaticMethodFactory.produceProduct2();
        product1.describe();
        product2.describe();
    }
}
