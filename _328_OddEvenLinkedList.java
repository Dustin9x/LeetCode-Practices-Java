import Study.LinkedList.LinkedList;

public class _328_OddEvenLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // giu lai dau cua even de connect
        while(even != null && even.next != null && odd!=null&&odd.next!=null){
            odd.next = even.next;
            odd = odd.next;

            even.next=odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        printLinkedList(odd);
        printLinkedList(head);
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
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next=n2; n2.next=n3; n3.next=n4; n4.next=n5;
//        printLinkedList(n1);
        oddEvenList(n1);
//        printLinkedList(n1);
    }
}
