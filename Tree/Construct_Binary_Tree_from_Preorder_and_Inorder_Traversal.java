 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
 }
class Solution {
    int preIndex;
    HashMap <Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex=0;
        for(int i=0;i<preorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder, int l, int r){
        
        if(l>r){
            return null;
        }
        
        int rootval= preorder[preIndex++];
        TreeNode root= new TreeNode(rootval);

        int pos=map.get(rootval);

        root.left=build(preorder,l,pos-1);
        root.right=build(preorder,pos+1,r);

        return root;

    }
}
