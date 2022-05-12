public class Baum<T> {
    Node root;
    private int size = 0;

    class Node{
        T value;
        Node leftnode, rightnode;

        public Node(T value){
            this.value = value;
        }
    }

    //Empty tree
    public Baum(){}

    public Baum(T value){
        root = new Node(value);
        this.size++;
    }

    public void insert(T value){
        this.size++;

        if(root == null){
            root = new Node(value);
        }
        else{
            insertElem(root, value);
        }
    }

    public  void insertElem(Node node, T value) {
        if(this.size-1 % 2 == 0){
              if(node.leftnode == null){
                  node.leftnode = new Node(value);
              }
              else{
                  insertElem(node.leftnode, value);
              }
        }
        else{
            if(node.rightnode == null){
                node.rightnode = new Node(value);
            }
            else{
                insertElem(node.rightnode, value);
            }
        }
    }


}
