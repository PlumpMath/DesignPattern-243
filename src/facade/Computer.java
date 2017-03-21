package facade;

/**
 * Created by PoliceUncle on 2017/3/18.
 */
public class Computer {
    CPU cpu;
    RAM ram;
    HardDisk hardDisk;

    public Computer() {
        cpu = new CPU();
        ram = new RAM();
        hardDisk = new HardDisk();
    }

    public void startUp() {
        System.out.println("Computer startUp");
        cpu.startUp();
        ram.startUp();
        hardDisk.startUp();
    }

    public void shutDown() {
        hardDisk.shutDown();
        ram.shutDown();
        cpu.shutDown();
        System.out.println("Computer shutDown");
    }
}
