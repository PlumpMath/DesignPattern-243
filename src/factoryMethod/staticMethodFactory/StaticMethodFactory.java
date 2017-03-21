package factoryMethod.staticMethodFactory;

/**
 * Created by sdt14096 on 2017/3/16.
 */
public class StaticMethodFactory {
    public static Product produceProduct1() {
        return new ConcreteProduct1();
    }

    public static Product produceProduct2() {
        return new ConcreteProduct2();
    }
}
