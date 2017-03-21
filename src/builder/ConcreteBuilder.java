package builder;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class ConcreteBuilder implements Builder {
    private Product product;

    @Override
    public void buildProduct() {
        System.out.println("begin build new product");
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        System.out.println("build partA");
        PartA partA = new PartA();
        product.setPartA(partA);
    }

    @Override
    public void buildPartB() {
        System.out.println("build partB");
        PartB partB = new PartB();
        product.setPartB(partB);
    }

    @Override
    public void buildPartC() {
        System.out.println("build partC");
        PartC partC = new PartC();
        product.setPartC(partC);
    }

    @Override
    public Product getProduct() {
        System.out.println("build product finished");
        return product;
    }
}
