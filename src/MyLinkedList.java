public class MyLinkedList<E>{

    private Node head;

    private int size;


    MyLinkedList(){
        size=0;
    }

    public void addFirst(E value){
        Node node=new Node(value);


        node.next=head;
        head=node;

        size++;
    }

    public void addLast(E value){

        if (head==null) {
            addFirst(value);
            return;
        }


        Node temp=head;
        Node node =new Node(value);

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;

        size++;
    }

    public void add(int position,E value){

        if (position<=0){
            addFirst(value);
            return;
        }
        if (position>=size) {
            addLast(value);
            return;
        }

        Node temp=head;

        for (int i=1;i<position;i++){
            temp=temp.next;
        }
        Node node=new Node(value);

        node.next=temp.next;
        temp.next=node;

        size++;
    }

    public E removeFirst(){
        if (size==0){
            throw new IllegalArgumentException("List Is Empty");
        }
        E first=head.value;
        head=head.next;

        size--;
        return first;
    }

    public E removeLast(){
        if (size==0){
            throw new IllegalArgumentException("List Is Empty");
        }
        if (size==1){
            E last=removeFirst();
            return last;
        }

        Node temp=head;

        while (temp.next.next!=null){
            temp=temp.next;
        }
        E last=temp.next.value;
        temp.next=null;


        size--;
        return last;
    }

    public E remove(int position){
        if (position<=0){
            return removeFirst();
        }
        if (position>=size-1){
            return removeLast();
        }

        Node temp=head;

        for (int i=1;i<position;i++){
            temp=temp.next;
        }
        E val=(E)temp.next.value;
        temp.next=temp.next.next;
        size--;

        return val;
    }



    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }


    class Node{
        private Node next;
        private E value;

        Node(E value){
            this.value=value;
        }
    }
}