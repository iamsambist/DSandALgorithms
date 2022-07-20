import java.util.Scanner;
import java.util.Vector;
public class MinimumCoins{
    public static void findMin(int v){
        Vector<Integer> ans=new Vector<>();
        int coins[]={1,2,5};
        int count=0;
        int length=coins.length;
        for(int i=length-1;i>=0;i--){
            while(v>=coins[i]){
                    v=v-coins[i];
                    ans.add(coins[i]);
                    count++;
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(" "+ans.elementAt(i));
        }
        System.out.println("\nTotal Length="+count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        MinimumCoins.findMin(num);
        sc.close();
        
    }
}