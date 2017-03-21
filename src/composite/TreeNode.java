package composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode treeNode) {
        children.add(treeNode);
    }

    public void remove(TreeNode treeNode) {
        if (children.indexOf(treeNode) != -1) {
            children.remove(treeNode);
        }
    }

    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}
