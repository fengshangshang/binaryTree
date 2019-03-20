public class BinaryTree<T> {
    public BinaryTree() {

    }

    public BinaryTree(TreeNode<T> root) {
        this.root = root;
    }

    private TreeNode<T> root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode getParent(TreeNode element){
        if(root == null || root ==element){
            return null;
        }else{
            return getParent(root,element);
        }
    }
    public TreeNode getParent(TreeNode subTree, TreeNode element) {
        if (subTree == null)
            return null;
        if (subTree.getLeft() == element || subTree.getRight() == element)
            return subTree;
        TreeNode p;
        if ((p = getParent(subTree.getLeft(), element)) != null)
            return p;
        else
            return getParent(subTree.getRight(), element);
    }
    public int getSize(){
        return getNum(root);
    }
    private int getNum(TreeNode node){
        if(node == null){
            return 0;
        }else{
            int i = getNum(node.getLeft());
            int j = getNum(node.getRight());
            return i+j+1;
        }
    }
    private int getHeight(){
        return getHeight(root);
    }

    private int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }else{
            int i = getHeight(node.getLeft());
            int j = getHeight(node.getRight());
            return i<j?(j+1):(i+1);
        }
    }

    public void perOrder(TreeNode node){
        if(node != null){
            System.out.println(node.getData());
            perOrder(node.getLeft());
            perOrder(node.getRight());
        }
    }

    public void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.getLeft());
            System.out.println(node.getData());
            inOrder(node.getRight());

        }
    }
    public void postOrder(TreeNode node){
        if(node != null){
            perOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData());
        }
    }
}
