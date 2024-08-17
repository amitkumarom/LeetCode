import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTreeInorderTraversal {
    
    // Method to perform inorder traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    // Helper method to recursively perform inorder traversal
    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree first
        inorderHelper(node.left, result);

        // Visit the current node
        result.add(node.val);

        // Traverse the right subtree next
        inorderHelper(node.right, result);
    }

    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.left = new TreeNode(5);

        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        List<Integer> inorder = solution.inorderTraversal(root);

        // Output the result of the inorder traversal
        System.out.println(inorder); // Output: [1, 3, 2]
    }
}
