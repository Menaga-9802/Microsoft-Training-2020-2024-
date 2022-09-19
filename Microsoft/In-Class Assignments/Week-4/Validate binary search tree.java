class Solution {

      public boolean isValidBST(TreeNode root) {

       return check(root,-Long.MAX_VALUE,Long.MAX_VALUE);

    }

    boolean check(TreeNode root,long min , long max){

        if(root==null)return true;

        if(root.val>=max || root.val<=min)return false;

        return check(root.left , min , root.val) && check(root.right , root.val , max) ;

    }

}
