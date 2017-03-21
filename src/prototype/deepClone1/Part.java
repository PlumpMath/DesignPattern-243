package prototype.deepClone1;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Part implements Cloneable{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
