public class _237_DeleteNodeInALinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public void deleteNode(ListNode node) {
        node.val = node.next.val; // clone node tiep theo
        node.next = node.next.next; // xoa node tiep theo
    }
}
