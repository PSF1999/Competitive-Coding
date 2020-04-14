Node Delete(Node head) {
        if(head == null) return head;
        else if(head.next == null) return null;
        else {
        Node fast = head;
        Node slow = head;
        Node prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
        }
    }
