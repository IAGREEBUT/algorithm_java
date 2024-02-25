public class MaximumDepthOfBinaryTree_104 {

 public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public int maxDepth(TreeNode root) {

        if(root==null) return 0;
        return findDepth(root,0);

        //return 1+ Math.max(findDepth(root.left),findDepth(root.right)); -> best solution

    }

    public int findDepth(TreeNode node, int level){

        level ++;
        if(node.right == null && node.left == null) return level;
        else {
            if(node.right==null) return findDepth(node.left, level);
            else if(node.left ==null) return findDepth(node.right, level);
            else return Math.max(findDepth(node.left, level),findDepth(node.right, level));
        }

    }




}
