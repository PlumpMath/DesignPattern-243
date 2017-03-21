package prototype.clone;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class ProtoType implements Cloneable{
    public Object clone() throws CloneNotSupportedException {
        ProtoType cloneProto = (ProtoType) super.clone();
        return cloneProto;
    }
}
