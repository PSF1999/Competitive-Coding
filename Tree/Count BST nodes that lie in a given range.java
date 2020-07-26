public static int getCountOfNode(Node root,int l, int h)
{
    int count = 0;
    if(root == null) 
        return 0;
    if(l <= root.data && root.data <= h)
        count++;
        
    return getCountOfNode(root.left,l,h) + getCountOfNode(root.right,l,h) + count;
   
}