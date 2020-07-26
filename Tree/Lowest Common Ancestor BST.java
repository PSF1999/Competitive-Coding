class BST
{   
    // Returns the LCA of the nodes with values n1 and n2
    // in the BST rooted at 'root' 
	Node LCA(Node root, int n1, int n2)
	{
	    if(root == null)
	        return null;
	    else if(n1 < root.data && n2 < root.data)
	        return LCA(root.left,n1,n2);
	   else if(n1 > root.data && n2 > root.data)
	        return LCA(root.right,n1,n2);
	   else
	        return root;
	    
    }
    
}