/*Given a n-ary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.*/


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
    int maxDepth;
    public int maxDepth(Node root) {
        maxDepth = 0;
        if(root==null)
            return 0;
        if(root.children==null)
            return 1;
        findDepth(root, 0);
        return maxDepth;
    }
    
    public void findDepth(Node root, int depth){
        if(root==null){
            if(depth > maxDepth){
                maxDepth = depth;
                return;
            }
        }
        depth++;
       if(depth > maxDepth){
            maxDepth = depth;
       }
        for(Node n : root.children){
            findDepth(n, depth);
        }
    }
}
