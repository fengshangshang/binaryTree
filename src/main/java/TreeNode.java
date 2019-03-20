public class TreeNode<T> {
    private TreeNode left;
    private TreeNode right;
    private T data;

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private TreeNode() {

    }

    public TreeNode(TreeNode<T> left, TreeNode<T> right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}
