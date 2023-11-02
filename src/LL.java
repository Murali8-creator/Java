public class LL {
    public static void main(String[] args) {
        MyLinkedList<Integer> ll= new MyLinkedList<>();




        ll.addLast(8);
        ll.display();
        System.out.println(ll.removeLast());

//        ll.removeFirst();
        ll.display();

        ll.addFirst(5);
        ll.display();

        ll.addLast(6);
        ll.display();

        ll.addFirst(7);
        ll.display();

        ll.addLast(100);
        ll.display();

        ll.add(3,9);
        ll.display();

        ll.add(0,1);
        ll.display();

        ll.add(7,101);
        ll.display();

        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.remove(2));


    }
}