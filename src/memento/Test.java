package memento;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Test {
    public static void main(String[] args) {
        Original original = new Original("origin");
        System.out.println("originValue : " + original.getValue());
        Storage storage = new Storage(original.createMemo());
        original.setValue("change");
        System.out.println("changeValue : " + original.getValue());
        original.restoreMemo(storage.getMemento());
        System.out.println("restoreValue : " + original.getValue());
    }
}
