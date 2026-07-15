/*
public class LinkedList {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node reverse(Node head){
            Node prev=null;
            Node current=head;
            Node next=null;
            while(current!=null){
                next=current.next; //store next node
                current.next=prev;//reverse link
                prev=current; //move prev forward

                current=next;//move current forward
            }
            return prev;
        }
    }

    public static void main(String[] args) {

    }
}

*/
/*
    public class LinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert node
    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display list
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Find middle element
    public void middle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element is: " + slow.data);
    }

    // Detect loop
    public boolean detectLoop() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Loop detected");
                return true;
            }
        }

        System.out.println("No loop");
        return false;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

        list.middle();

        list.detectLoop();
    }
}

 */
//merge two sorted linked list
