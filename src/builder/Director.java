package builder;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Director {
    private Builder builder;

    public Builder setBuilder() {
        return builder;
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildProduct();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
