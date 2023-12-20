public class _147_InsertionSortList {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode sortedTail = head;
        while (sortedTail.next != null){
            if(sortedTail.val <= sortedTail.next.val){
                sortedTail = sortedTail.next;
            }else{
                ListNode temp = sortedTail.next; // luu lai vi tri can chen vao temp
                sortedTail.next = sortedTail.next.next; // go bo phan tu temp ra khoi list
                ListNode prev = dummy; //tao con tro prev de duyet list
                while(prev.next.val <= temp.val){
                    prev = prev.next; //di chuyen con tro de tim vi tri moi cho temp
                }
                temp.next = prev.next; // 2.temp cho den phan tu sau prev
                prev.next = temp; //1. sau khi tim dc thi gan temp vao sau prev
            }
        }
        return dummy.next;
    }
}
