import java.util.Scanner;

public class CreateTree {
 

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        createTree();
        traverseTree();
    }
    private static Node createTree() {
        Node root=null;
        System.out.println("Enter data:");
        int data=sc.nextInt();

        if(data==-1) return null;
//      if not -1 something data we want to fill for the node

        root=new Node(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();

        System.out.println("Enter right for "+data);
        root.right=createTree();
        
        
        return root;
    }
    private static void traverseTree(){
            
    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}
