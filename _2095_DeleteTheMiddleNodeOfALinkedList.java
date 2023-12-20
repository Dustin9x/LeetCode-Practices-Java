import Study.LinkedList.LinkedList;

public class _2095_DeleteTheMiddleNodeOfALinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return  null;

        ListNode fast = head.next.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public static void printLinkedList (ListNode head) {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            ListNode temp = head;
            while (temp != null){
                System.out.print(" " + temp.val);
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(6);

        n1.next=n2; n2.next=n3; n3.next=n4; n4.next=n5;n5.next=n6;n6.next=n7;
        printLinkedList(n1);
        deleteMiddle(n1);
        printLinkedList(n1);
    }
}
