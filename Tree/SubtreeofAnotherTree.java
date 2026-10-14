class Solution{
    public boolean isSubtree(TreeNode root, TreeNode subtree){
        if(subtree==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(isSameTree(root,subtree)){
            return true;
        }
        return isSubtree(root.left,subtree)||isSubtree(root.right,subtree);
    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true; 
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
