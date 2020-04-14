static Node construct(int arr[][],int n)
    {
        Node head = new Node(0);
        Node temp = head;
        for(int i = 0; i < n; i++) {
            Node x = temp;
            if(temp.data != 0) {
                temp.down = new Node(0);
                temp = temp.down;
                x = temp;
            }
            for(int j = 0; j < n; j++) {
                int a = arr[i][j];
                if(x.data == 0) {
                    x.data = a;
                }
                else {
                    x.right = new Node(a);
                    x = x.right;
                }
            }
        }
        return head;
    }