

public class SymmetricTree_101 {


 // Definition for a binary tree node.
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




    public boolean isSymmetric(TreeNode root) {

        if(root==null) return true;

        return isSame(root.left, root.right);

    }

    public boolean isSame(TreeNode left, TreeNode right){ //두 값이 같은지


      if(left == null && right == null) return true;//둘다 null이면 같음
      else if(left ==null || right ==null) return false;//둘중 하나만 null이면 다름

      //두개가 값이 같고, 대칭방향으로 재귀
      return left.val==right.val && isSame(left.left,right.right) && isSame(left.right, right.left);

    }


}
