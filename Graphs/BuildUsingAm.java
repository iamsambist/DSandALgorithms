import java.util.Scanner;
/*
 * (3)-----(5)
 *        - - 
 *      -   -      
 *    -     -
 * (4)-----(1)
 *    -    -
 *      (2)
 */ 

public class BuildUsingAm{
   
    public  void addEdegs(int source,int des,int a[][]){
        int x=source;
        int y=des;
        switch(x){
            case 3: 
              source=0;
                break;
            case 5:
                source=1;
                    break;
            case 4:
                source=3;
                break;
            case 1:
                source=2;
                    break;
            case 2:
                source=4;
                break;

        }
        switch(y){
            case 3: 
              des=0;
                break;
            case 5:
                des=1;
                    break;
            case 4:
                des=3;
                break;
            case 1:
                des=2;
                    break;
            case 2:
                des=4;
                break;

        }
        a[source][des]=1;
        a[des][source]=1;
    }
    public void display(int [][] arr){
            for(int i=0;i<arr.length;i++){

                for(int j=0;j<arr[i].length;j++){
                    System.out.print(" "+arr[i][j]);
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BuildUsingAm bg=new BuildUsingAm();
        System.out.println("Enter Number of vertex and edges");
        int vertex=sc.nextInt();
        int edge=sc.nextInt();
        int from,to;
        int a[][]=new int[vertex][vertex];
         System.out.println("Enter the Edeges");
         for(int i=0;i<edge;i++){
            from=sc.nextInt();
            to=sc.nextInt();
           bg.addEdegs(from,to,a);
         }
         System.out.println("Graph Created Successfully");
         bg.display(a);
    }
}