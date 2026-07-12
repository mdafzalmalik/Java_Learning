class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        int[] arr = { 25, 5, 8, 1 };
        Node head = converArrToLL(arr);
        // System.out.println(lengthOfLL(head));
        // System.out.println(searchInLL(head, 8));
        // head = removeEle(head, 25);
        head = insertBeforeEle(head, 350, 1);
        printLL(head);
    }

    private static Node converArrToLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private static int searchInLL(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    private static Node removeHead(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    private static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node removeKthEle(Node head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            return head.next;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = temp.next;
                // or
                // prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node removeEle(Node head, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            return head.next;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insertAtHead(Node head, int val) {
        // Node newNode = new Node(val, head);
        // return newNode;
        // or
        return new Node(val, head);
    }

    private static Node insertAtTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;

    }

    private static Node insertAtKthPosition(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            } else {
                return null;
            }
        }
        if (k == 1) {
            return new Node(val, head);
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == (k - 1)) {
                // Node newNode = new Node(val);
                // newNode.next = temp.next;
                // or
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertBeforeEle(Node head, int val, int ele) {
        if (head == null) {
            return null;
        }
        if (head.data == ele) {
            return new Node(val, head);
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == ele) {
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

}