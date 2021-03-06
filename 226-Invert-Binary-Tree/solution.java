/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Recursion Time: O(n) Space O(h)
// public class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if(root == null) return null;
//         TreeNode left = root.left;
//         TreeNode right = root.right;
//         root.right = invertTree(left);
//         root.left = invertTree(right);
        
//         return root;
//     }
// }

//Iteration Time: O(n) space O(n)
// 这里并不需要对每一层的数据输出，所以不需要一个for循环
// public class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         Queue<TreeNode> q = new LinkedList();
//         if(root == null) return null;
//         q.offer(root);
//         while(!q.isEmpty()) {
//             TreeNode node = q.poll();
            
//             TreeNode left = node.left;
//             node.left = node.right;
//             node.right = left;
            
//             if(node.left != null) {
//                 q.offer(node.left);
//             }
            
//             if(node.right != null) {
//                 q.offer(node.right);
//             }
//         }
        
//         return root;
//     }
// }

//Dfs
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> s = new Stack();
        if(root == null) return root;
        
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode node = s.pop();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            
            if(node.left != null) {
                s.push(node.left);
            }
            
            if(node.right != null) {
                s.push(node.right);
            }
        }
        
        return root;
    }
}