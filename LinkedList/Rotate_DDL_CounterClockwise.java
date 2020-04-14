static Node getLast(Node head) {
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        return temp;
    }
    
    Node rotateP (Node head, int p){
        Node temp = head;
        Node last = getLast(head);
        while(p-- != 0) {
            
            Node first = temp;
            temp = temp.next;
            temp.prev = null;
            first.next = null;
            last.next = first;
            first.prev = last;
            last = last.next;
        }
        return temp;
    }
