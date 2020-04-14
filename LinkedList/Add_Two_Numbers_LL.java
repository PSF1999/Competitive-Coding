 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode r = result,t1 = l1,t2 = l2;
        while(t1 != null || t2 != null) {
            int sum = carry;
            sum+= (t1 != null)? t1.val : 0;
            sum+= (t2 != null)? t2.val : 0;
            carry = sum / 10;
            sum = sum % 10;
            r.next = new ListNode(sum);
            r = r.next;
            t1 = (t1 != null)? t1.next : null;
            t2 = (t2 != null)? t2.next : null;
        }
         if(carry == 1) {
            r.next = new ListNode(carry);
        }
        return result.next;
    }