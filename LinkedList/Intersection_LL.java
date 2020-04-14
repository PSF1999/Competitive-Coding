 Set<ListNode> set= new HashSet<>();
        ListNode currA= headA;
        while(currA!=null){
            set.add(currA);
            currA=currA.next;
        }
        ListNode currB=headB;
        while(currB!=null){
            if(set.contains(currB))return currB;
            currB=currB.next;
        }return null;