import java.util.*;

public class TwoSolution {
    public static int hold;
    public static void main(String[] args) {
       Map<Integer,Integer> pair=new HashMap<>();
       Set<Integer> num=new HashSet<>();
       int arr[]={3,2,3};
       int brr[]=new int[2];
       int targt=6;
       for(int i=0;i<arr.length;i++){
        hold=0;
             hold=targt-arr[i];

                if(num.contains(hold)==true){
                     brr[0]=i;
                  
                     
                }
                else{
                    num.add(arr[i]);
                }
       }
       System.out.println(pair);
    }
}
