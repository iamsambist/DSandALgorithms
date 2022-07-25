import java.util.Scanner;
import java.util.Arrays;

public class KthElement {
   static int arr[];
   static int k;
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // Finding the kth minimum element in the any givin array
         takeArrayInput();
        
         giveUSValue();
      
         sortTheArray();
         System.out.println("that's your answer dear");
         System.out.println(arr[k-1]);
    }
    public static void takeArrayInput(){
            
            System.out.println("Enter the Size of Array");
            int size=sc.nextInt();
            arr=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
          
    }
    public static void giveUSValue(){
        System.out.println("value of k please");
            k=sc.nextInt();
        
    }
    public static void sortTheArray(){
            Arrays.sort(arr);

    }
}
