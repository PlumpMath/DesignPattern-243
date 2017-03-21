package facade;

/**
 * Created by PoliceUncle on 2017/3/18.
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startUp();
        System.out.println("------");
        computer.shutDown();
    }
}
