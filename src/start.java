
class Node { // описание элемента
    public int value;
    public Node next;
    Node(int value, Node next) { // конструктор
        this.value = value;
        this.next = next;
    }}
public class start{ // главный класс
    public static void createHeadRec (int i) {
        Node head = new Node(0, null);
        Node tail = head;
        if (i < 9) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
            i = i + 1;
            Node ref = head;
            if (ref != null ) {
                ref = ref.next;
                System.out.print(" " + ref.value);
                createHeadRec(i);
          }

        }
    }
    public static void createTailRec(int i ){

        Node head = null;
        if ( i >= 0) {
            head = new Node(i, head);
            i = i - 1;;
            Node ref = head;
            if (ref != null) {
                System.out.print(" " + ref.value);
                ref = ref.next;
            }
            createTailRec(i);
        }
    }
    //главный класс
    public static void main(String[] args) {
        createHead();
        createTail();
        AddFirst(5);
        AddLast(201);
        Insert();
        RemoveFirst();
        RemoveLast();
        Remove(5);
        createHeadRec(0);
        System.out.println("");
         createTailRec(9);
    }
    public static void createHead(){
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println(" ");
    }
    public static void createTail() {
            Node head = null;
            for (int i = 9; i >= 0; i--) {
                head = new Node(i, head);
            }
                Node ref = head;
                while (ref != null) {
                    System.out.print(" " + ref.value);
                    ref = ref.next;
                }
        System.out.println(" ");
    }
    public static void AddFirst(int d) {
        Node head=new Node(0, null);
        Node tail=head;
        head=new Node(d,head);
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println(" ");
    }
    public static void AddLast(int x){
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
            Node newtail=new Node(x, null);
            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;
                System.out.print(" " + ref.value);
            }
                ref.next=newtail;
           while (ref.next != null) {
            ref = ref.next;
          }
        System.out.print(" " + ref.value);
        System.out.println(" ");
    }
    public static void Insert(){
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        Node newNode=new Node(44, null);
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            System.out.print(" " + ref.value);
            k++;
        }
        newNode.next=ref.next.next;
        ref.next=newNode;
        while (ref.next != null) {
            ref = ref.next;
            System.out.print(" " + ref.value);
        }
        System.out.println(" ");
    }
    public static void RemoveFirst(){
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            k++;
        }
        ref.next=ref.next.next;
        ref = head;
        while (ref.next != null) {
            ref = ref.next;
            System.out.print(" " + ref.value);
        }
        System.out.println(" ");
    }
    public static void RemoveLast(){
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<8 )) {
            ref = ref.next;
            k++;
        }
        ref.next=ref.next.next;
        ref = head;
        while (ref.next != null) {
            ref = ref.next;
            System.out.print(" " + ref.value);
        }
        System.out.println(" ");
    }
    public static void Remove(int x){
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next;
        }
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<x )) {
            ref = ref.next;
            k++;
        }
        ref.next=ref.next.next;
        ref = head;
        while (ref.next != null) {
            ref = ref.next;
            System.out.print(" " + ref.value);
        }
        System.out.println(" ");
                            }

}