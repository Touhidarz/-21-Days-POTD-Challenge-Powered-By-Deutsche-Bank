class Solution
{
    static void inorder(Node root){
        
        if(root.left != null){
            Node pred = root.left;
            
            while (pred.right != null) {
                pred = pred.right;
            }
            
            inorder(root.left);
            pred.right = root;
            root.left = pred; 
        }
        
        if (root.right != null) {
            Node succ = root.right;
            
            while (succ.left != null) {
                succ = succ.left;
            }
            
            inorder(root.right);
            root.right = succ;
            succ.left = root;
        }
    }
    
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here
	    if(root==null){
	        return root;
	    }
	    
	    Node head = root;
	    while(head.left != null){
	        head = head.left;
	    }
	    
	    inorder(root);
	    
	    return head;
	    
    }
}