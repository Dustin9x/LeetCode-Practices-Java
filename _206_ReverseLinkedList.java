public class _206_ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head;

        while(head != null && curNode.next != null){
            ListNode next = curNode.next;
            curNode.next = next.next; // noi curNode voi node sau node next
            next.next = head; // noi next nguoc lai ve head
            head = next; // chuyen head ve lai dau
        }
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

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n1 = reverseList(n1);
        printLinkedList(n1);
    }
}
