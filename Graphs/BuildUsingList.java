import java.util.LinkedList;
import java.util.Scanner;

/*
 * we need a arrayOfLinkedList
 */
class Graph{
    private LinkedList<Integer> arr[];
    public Graph(int v){
        arr=new LinkedList[v];
        for(int i=0;i<v;i++){
            arr[i]=new LinkedList<Integer>();
        }
    
    }
    public void addEdegs(int source,int des){
        arr[source].add(des);
        arr[des].add(source);
    }
}
public class BuildUsingList {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int vertext=sc.nextInt();
        int e=sc.nextInt();
        Graph g=new Graph(vertext);
        System.out.println("Enter "+e+"Edges");
        for(int i=0;i<e;i++){
            int source=sc.nextInt();
            int des=sc.nextInt();
            g.addEdegs(source, des);
        }
    }

    
}
