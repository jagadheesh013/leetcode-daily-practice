public class Codec{
    public String Serialize(TreeNode root){
       StringBuilder sb= new StringBuilder();
       Build(root,sb);
       return sb.toString(); 
    }

    private void Build(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");
        Build(root.left, sb);
        Build(root.right, sb);
    }

    public TreeNode deserialize(String data){
        Queue<String> node= new 
    }
}
