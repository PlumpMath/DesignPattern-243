package prototype.serializableClone;

import java.io.IOException;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableObject serializableObject = new SerializableObject();
        serializableObject.setId(22);
        Prototype originProto = new Prototype();
        originProto.setName("proto");
        originProto.setSerializableObject(serializableObject);
        Prototype copyProto = (Prototype) originProto.deepClone();
        System.out.println(copyProto.getName());
        System.out.println(copyProto.getSerializableObject().getId());
        System.out.println(originProto.getSerializableObject() == copyProto.getSerializableObject());
    }
}
