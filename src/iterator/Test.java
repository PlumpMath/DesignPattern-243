package iterator;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        Collection myCollection = new MyCollection();
        Iterator myIterator = myCollection.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
