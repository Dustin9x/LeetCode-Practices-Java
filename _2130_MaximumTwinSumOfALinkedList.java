public class _2130_MaximumTwinSumOfALinkedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        while(head!=null && curr.next != null){
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = head;
            head = next;
        }
        return head;
    }
    public static int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverse = reverse(slow);
        int max = 0;
        while(reverse!=null && head!=null){
            max = Math.max(max,reverse.val + head.val);
            reverse = reverse.next;
            head = head.next;
        }
        return max;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);

        n1.next =n2; n2.next=n3; n3.next=n4;

        System.out.println(pairSum(n1));
    }
}
