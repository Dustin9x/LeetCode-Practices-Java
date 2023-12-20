import Study.LinkedList.LinkedList;

public class _2807_InsertGreatestCommonDivisorsInLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public static int greatestCommon(int a, int b){
      if(b==0) {
          return a;
      }else{
          return greatestCommon(b,a%b);
      }
  }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        while(temp.next != null){
            ListNode next = temp.next;
            int gcd = greatestCommon(temp.val, next.val);
            temp.next = new ListNode(gcd);
            temp = temp.next;
            temp.next = next;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(18);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(10);
        ListNode n4 = new ListNode(3);
        n1.next=n2;n2.next=n3;n3.next=n4;
        insertGreatestCommonDivisors(n1);
        ListNode temp = n1;
        while (temp != null){
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }
}
