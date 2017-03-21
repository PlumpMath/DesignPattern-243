package flyweight;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class ConcreteFlyweight extends Flyweight{
    String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("flyweight : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
