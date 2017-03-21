package factoryMethod.MultiFactory;

/**
 * Created by sdt14096 on 2017/3/16.
 */
public class MultiMethodFactory {
    public Product produceProduct1() {
        return new ConcreteProduct1();
    }

    public Product produceProduct2() {
        return new ConcreteProduct2();
    }
}
