class Node {
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DLinkedList {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6 };
        Node head = convertArrToDLL(arr);
        head = insertBeforeElement(head, 7, 0);
        print(head);

    }

    private static Node convertArrToDLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node removeHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    private static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        prev.next = null;
        temp.back = null;

        return head;
    }

    private static Node removeKthEle(Node head, int k) {
        if (head == null) {
            return null;
        }
        if (k <= 0) {
            System.out.println("k must be greater than zero");
            return head;
        }

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("k is out of range");
            return head;
        }

        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return removeHead(head);
        } else if (front == null) {
            return removeTail(head);
        } else {
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;

    }

    private static Node removeEle(Node head, int val) {
        if (head == null) {
            return null;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element is not found");
            return head;
        }

        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return removeHead(head);
        } else if (front == null) {
            return removeTail(head);
        } else {
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }

    private static Node insertAtHead(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node newNode = new Node(val, head, null);
        head.back = newNode;
        return newNode;
    }

    private static Node insertAtTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val, null, temp);
        temp.next = newNode;
        return head;
    }

    private static Node insertAtKthPosition(Node head, int k, int val) {
        if (k <= 0) {
            System.out.println("k must be greater than zero");
            return head;
        }
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            }
            return head;
        }
        if (k == 1) {
            return insertAtHead(head, val);
        }

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }

        if (temp == null) {
            if (count + 1 == k) {
                return insertAtTail(head, val);
            }
            System.out.println("k must be in range");
            return head;
        }

        Node prev = temp.back;
        Node newNode = new Node(val, prev.next, prev);
        prev.next = newNode;
        temp.back = newNode;

        return head;
    }

    private static Node insertBeforeElement(Node head, int ele, int val) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.data == ele) {
                break;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found");
            return head;
        }

        if (temp.back == null) {
            return insertAtHead(head, val);
        }

        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);

        prev.next = newNode;
        temp.back = newNode;

        return head;
    }
}