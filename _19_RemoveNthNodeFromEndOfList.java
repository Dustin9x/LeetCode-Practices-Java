public class _19_RemoveNthNodeFromEndOfList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
    }

    //Cach 1
    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        while(fast.next !=null){
            fast = fast.next;
            if(n-- <= 0){ //moi vong lap while thi n-1, nen slow se chay sau fast n buoc
                slow = slow.next;
            }
        }

        slow.next = slow.next.next;
        return dummyNode.next;
    }


    //Cach 2
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy;
        ListNode fast = dummy;
        for (int i = 0; i <= n; i++) { // fast chay truoc n buoc
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
