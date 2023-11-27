public class Main {
    public static void main(String[] args) {
        BST bst=new BST();

        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(5);
        bst.insert(12);
        bst.insert(8);
        bst.insert(19);

        bst.display();
        bst.preOrder();
        System.out.println();
        bst.postOrder();
        System.out.println();
        bst.inOrder();



    }
}