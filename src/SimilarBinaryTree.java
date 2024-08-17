public class SimilarBinaryTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, the trees are the same
        if (p == null && q == null) {
            return true;
        }
        // If one of the nodes is null, the trees are not the same
        if (p == null || q == null) {
            return false;
        }
        // If the values of the nodes are different, the trees are not the same
        if (p.val != q.val) {
            return false;
        }
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SimilarBinaryTree solution = new SimilarBinaryTree();

        // Creating first tree
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Creating second tree
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(4);

        // Checking if trees are the same
        boolean result = solution.isSameTree(p, q);
        System.out.println("Are the trees the same? " + result); // Output: true
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}