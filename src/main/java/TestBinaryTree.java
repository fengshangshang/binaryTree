
public class TestBinaryTree {
    public static void main(String[] args) {
        TreeNode d = new TreeNode(null,null,"D");
        TreeNode e = new TreeNode(null,null,"E");
        TreeNode f = new TreeNode(null,null,"F");
        TreeNode g = new TreeNode(null,null,"G");
        TreeNode b = new TreeNode(d,e,"B");
        TreeNode c = new TreeNode(f,g,"C");
        TreeNode a = new TreeNode(b,c,"a");
        BinaryTree binaryTree = new BinaryTree(a);
        System.out.println(binaryTree.getSize());
        System.out.println(binaryTree.getParent(g).getData());
        binaryTree.perOrder(a);
        System.out.println("=========");
        binaryTree.inOrder(a);
        System.out.println("=========");
        binaryTree.postOrder(a);
    }
}
