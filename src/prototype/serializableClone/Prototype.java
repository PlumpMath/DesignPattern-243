package prototype.serializableClone;

import java.io.*;

/**
 * Created by sdt14096 on 2017/3/17.
 */

public class Prototype implements Serializable{
    public static final long serialVersionUID = 1L;
    String name;
    SerializableObject serializableObject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SerializableObject getSerializableObject() {
        return serializableObject;
    }

    public void setSerializableObject(SerializableObject serializableObject) {
        this.serializableObject = serializableObject;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream bis = new ObjectInputStream(bais);
        return bis.readObject();
    }
}
