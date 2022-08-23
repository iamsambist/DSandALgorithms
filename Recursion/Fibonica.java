import java.util.Scanner;

public class Fibonica{
    public static int fibonica(int num){
      if(num==0) return 0;
      else if(num==1) return 1;
        return fibonica(num-1)+fibonica(num-2);
    }
    public static void main(String[] args) {
        // recursion properties
        /*
         * 1 Find base case
         * 2. determine the relation between the problem and subproblem means if somebody 
         * gave you f(n-1) how you find f(n)
         * 3 generalize all 
         */

         /*
          * base case if(n==0)return 0 and if(n==1)return 1
          relation f(5th element)=f(4th )+f(3rd)
          generalize f(n)=f(n-1)+f(n-2)
          */
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          sc.close();
          
          for(int i=0;i<=num;i++){
         System.out.print(fibonica(i)+" ");
    
          }
    }
}