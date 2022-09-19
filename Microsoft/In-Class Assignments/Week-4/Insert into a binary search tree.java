class Solution {

   public TreeNode insertIntoBST(TreeNode root, int val) {
      return insert(root,val);
   }
   TreeNode insert(TreeNode root,int val){
   if(root==null){
       TreeNode node=new TreeNode(val);
       root=node;
       return root;
   }else if(val<root.val){
       root.left= insert(root.left,val);
   }else{
       root.right= insert(root.right,val);
   }
   return root;
   }
}
