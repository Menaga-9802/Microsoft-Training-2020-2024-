class Solution {

    public boolean isBalanced(TreeNode root) {

      if(root == null){

       return true;

      }

      var deepthL = deepth(root.left);

      var deepthR = deepth(root.right);

      return deepthL != -1 && deepthR != -1 && Math.abs(deepthL - deepthR) <= 1;

  }

  private int deepth(final TreeNode current)

  {

    if(current == null){

      return 0;

    }

    if(current.left == null && current.right == null){

      return 1;

    }

    var deepthL = deepth(current.left);

    var deepthR = deepth(current.right);

    if(Math.abs(deepthL - deepthR) > 1 || deepthL == -1 || deepthR == -1){


        return -1;

    }
    return 1 + Math.max(deepthL, deepthR);

  }

}
