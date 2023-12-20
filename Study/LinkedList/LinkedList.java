package Study.LinkedList;

public class LinkedList {

    public static class Node {
        int value;
        Node next;
        Node (int value) {
            this.value = value;
        }
    }

    public static void printLinkedList (Node head) {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null){
                System.out.print(" " + temp.value);
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static Node addToHead(Node headNode, int val){
        Node newNode = new Node(val);
        if(headNode != null){
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int val){
        Node newNode = new Node(val);
        if (headNode == null){
            return newNode;
        } else {
            //B1: xac dinh last Node
            Node lastNode = headNode;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }

            //B2: Gan next cho lastNode = newNode
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int val, int index){
        if (index == 0) {
            return addToHead(headNode, val);
        }else {
            //B1: tim vi tri can them
            Node curNode = headNode;
            Node newNode = new Node(val);
            int count = 0;
            while (curNode != null){
                count++;
                if(count == index){
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next; //tim index
            }
        }
        return headNode;
    }

    public static Node removeHead(Node headNode){
        if(headNode != null){
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeTail(Node headNode){
        if(headNode == null) return null;

        //B1: xac dinh lastNode va previous cua last Node
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next !=null){
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if(prevNode == null){
            return null;
        }else {
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index){
        if(headNode == null || index < 0) return null;

        if(index == 0) return removeHead(headNode);

        Node curNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean isFound = false;
        while(curNode != null){
            if(count == index){
                isFound = true;
                break;
            }
            prevNode = curNode;
            curNode = curNode.next;
            count++;
        }

        if(isFound){
            if(prevNode == null){ //curNode la lastNode
                return null;
            }else{
                if(curNode != null) {
                    prevNode.next = curNode.next;
                }
            }
        }

        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next=n2;
        n2.next=n3;

        printLinkedList(n1);

        Node newNode = addToHead(n1,0);
        printLinkedList(newNode);

        n1 = addToTail(n1,4);
        printLinkedList(n1);

        n1 = addToIndex(n1, 5, 0);
        printLinkedList(n1);

        n1 = removeHead(n1);
        printLinkedList(n1);

        n1 = removeTail(n1);
        printLinkedList(n1);

        n1 = removeAtIndex(n1,1);
        printLinkedList(n1);
    }
}
