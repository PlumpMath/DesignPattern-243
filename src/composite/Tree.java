package composite;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("root");
        TreeNode nodeA = new TreeNode("nodeA");
        TreeNode nodeB = new TreeNode("nodeB");
        tree.root.add(nodeA);
        tree.root.add(nodeB);
    }
}
