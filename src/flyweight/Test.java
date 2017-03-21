package flyweight;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        FlyweightFactory flyweightFactory = new FlyweightFactory(4, 26);
        flyweightFactory.getFlyweight(2).operation();
        System.out.println(flyweightFactory.getRealSize());
        flyweightFactory.getFlyweight(3).operation();
        System.out.println(flyweightFactory.getRealSize());
        flyweightFactory.getFlyweight(4).operation();
        System.out.println(flyweightFactory.getRealSize());
        flyweightFactory.getFlyweight(7).operation();
        System.out.println(flyweightFactory.getRealSize());
        flyweightFactory.getFlyweight(7).operation();
        System.out.println(flyweightFactory.getRealSize());
    }
}
