/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List list;
    public List<Integer> postorder(Node root) {
        list = new ArrayList();
        traverse(root);
        return list;
    }
    public void traverse(Node root){
        if(root==null)
            return;
        for(Node child : root.children)
            traverse(child);
        list.add(root.val);
    }
}
