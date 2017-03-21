package prototype.deepClone1;

/**
 * Created by sdt14096 on 2017/3/17.
 */

public class ProtoType implements Cloneable{
    int id;
    Part part;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Object clone() throws CloneNotSupportedException {
        ProtoType cloneProto = (ProtoType) super.clone();
        cloneProto.part = (Part) part.clone();
        return cloneProto;
    }
}
