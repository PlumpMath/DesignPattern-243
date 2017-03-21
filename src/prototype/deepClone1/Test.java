package prototype.deepClone1;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Part part = new Part();
        part.setId(5);
        ProtoType originProto = new ProtoType();
        originProto.setPart(part);
        originProto.setId(1);
        ProtoType copyProto = (ProtoType) originProto.clone();
        System.out.println("protoID:" + copyProto.getId());
        System.out.println("partId:" + copyProto.getPart().getId());
        System.out.println(copyProto.part == originProto.part);
    }
}
