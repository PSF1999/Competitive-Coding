/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    
    Node left,right;
    int data;
    public Node(int d) {
        Node left = null;
        Node right = null;
        data  = d;
    }
}

class GFG {
    
    static Node createTree(int[] A,int l,int r) {
        if(l > r)
            return null;
        int mid = ((l + r) / 2);
        Node root = new Node(A[mid]);
        root.left = createTree(A,l,mid - 1);
        root.right = createTree(A,mid + 1,r);
        return root;
    }

    static void preOrder(Node root) {
        if(root == null)
            return;
        else {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        
    }
	public static void main (String[] args) {
	    Node tree = null;
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-- != 0) {
	        int N = sc.nextInt();
	        int[] A = new int[N];
	        for(int i = 0; i < N; i++)
	            A[i] = sc.nextInt();
	        tree = createTree(A,0,N-1);
	        preOrder(tree);
	    }
		//code
	}
}