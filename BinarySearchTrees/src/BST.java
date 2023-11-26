public class BST {

    class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value=value;
        }
    }

    private Node root;

    BST(){

    }

    public boolean isEmpty(){
        return root==null;
    }

    public int getHeight(Node node){
        if (node==null)
            return -1;

        return node.height;
    }

    public void insert(int value){
       root=insert(value,root);
    }
    private Node insert(int value,Node node){
        if (node==null){
            node=new Node(value);
            return node;
        }
        if(value< node.value){
            node.left=insert(value,node.left);
        }
        if (value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;

        return node;
    }

    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node,String details){

        if (node==null){
            return;
        }

        System.out.println(details+node.value);

        display(node.left,"Left Child of "+node.value+" : ");
        display(node.right,"Right Child of "+node.value+" : ");

    }

}
