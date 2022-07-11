package kz.home.ys.algo.hard.serializeAndDeserializeBinaryTree;

public class SerializeAndDeserializeBinaryTree {

    private int idx = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        serializeWithDfs(root, sb);

        String result = sb.toString();
        return result.substring(0, result.length() - 1);
    }

    private void serializeWithDfs(TreeNode curr, StringBuilder sb) {
        if (curr == null) {
            sb.append("N,");
            return;
        }

        sb.append(curr.val);
        sb.append(",");
        serializeWithDfs(curr.left, sb);
        serializeWithDfs(curr.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null) {
            return null;
        }

        return deserializeWithDfs(data.split(","));
    }

    private TreeNode deserializeWithDfs(String[] vals) {
        if (vals[idx].equals("N")) {
            idx++;
            return null;
        }

        TreeNode curr = new TreeNode(Integer.parseInt(vals[idx]));
        idx++;
        curr.left = deserializeWithDfs(vals);
        curr.right = deserializeWithDfs(vals);

        return curr;
    }
}