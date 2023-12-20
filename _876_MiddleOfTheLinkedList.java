import Study.LinkedList.LinkedList;

import java.util.ArrayList;

public class _876_MiddleOfTheLinkedList {
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

    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while(end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
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

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        printLinkedList(middleNode(n1));
    }
}
