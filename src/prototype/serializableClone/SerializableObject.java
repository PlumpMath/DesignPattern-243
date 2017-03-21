package prototype.serializableClone;

import java.io.Serializable;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class SerializableObject implements Serializable {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static final long serialVersionUID = 1L;
}
