public class _203_RemoveLinkedListElements {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr.next != null){
            if (curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(7);
        ListNode n6 = new ListNode(7);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;n5.next = n6;
        removeElements(n1,8);
        while(n1!= null){
            System.out.print(n1.val);
            n1 = n1.next;
        }
    }
}
