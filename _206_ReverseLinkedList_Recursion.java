public class _206_ReverseLinkedList_Recursion {
    public static class ListNode {
        int val;
        _206_ReverseLinkedList_Recursion.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    public static ListNode reverseList(ListNode head) {
        //TH Co co
        if(head == null) return null;

        ListNode nextNode = head.next;
        if(nextNode == null) return head; //LinkedList chi co 1 node

        //TH Tong quat
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;

        return newHead;
    }

    public static void printLinkedList (ListNode head) {
        while(head != null) {
                System.out.print(" " + head.val);
                head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n1 = reverseList(n1);
        printLinkedList(n1);
    }
}
