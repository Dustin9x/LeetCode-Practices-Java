public class _234_PalindromeLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        while (curr != null && curr.next != null){
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = head;
            head = next;
        }
        return head;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverseList = reverse(slow);
        while(reverseList != null && head != null){
            if(reverseList.val != head.val){
                return false;
            }
            reverseList = reverseList.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2; n2.next=n3; n3.next = n4;

        System.out.println(isPalindrome(n1));
    }
}
