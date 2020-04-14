public void deleteAlternate (Node head){
         Node cur = head;
        while(cur != null && cur.next != null) {
            Node temp = cur.next;
            cur.next = temp.next;
            temp = null;
            cur = cur.next;
        }
