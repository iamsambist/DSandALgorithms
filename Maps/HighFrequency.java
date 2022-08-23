import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        int n=5;
        int arr[]={1,2,2,3,2};
        sc.close();

        Map<Integer,Integer> num=new HashMap<>();
        int hold;
        int curValue;
        for(int j=0 ; j<n ;j++){
                hold=arr[j];
                if(num.containsKey(hold)){
                    curValue=num.get(hold);
                    num.replace(hold,curValue ,curValue+1);
                }
                else{
                num.put(hold, 0);
                }
        }
        int farr[]=new int[2];
       farr= getmaxEntry(num);
       if(farr[0]==farr[1]){
        System.out.println("2 or more than 2 element has highest Frequency");
       }
       else{
        System.out.println("single element has highest frequency "+farr[0]);
       }
      
        displayMap(num);
    }

    private static int[] getmaxEntry(Map<Integer, Integer> num) {
        int size=num.size();
        int arr[]=new int[size];
        int j=0;
        for (Integer i : num.values()) {
            arr[j]=i;
            ++j;  
        }
        int maxpose;
        int count=0;
        // largest two numbers 
        int l1=0;
        int l2=0;
        int brr[]=new int[2];
        for(int k=(arr.length-1);k>0;k--){
                maxpose=0;
                    for(int l = 1;l <=k;l++){
                        if(arr[l]>arr[maxpose]){
                            maxpose=l;
                        }
                    }
                    if(maxpose!=k){
                            int temp=arr[maxpose];
                            arr[maxpose]=arr[k];
                            arr[k]=temp;


                    }
                    
                    switch(count){
                        case 0 : brr[0]=arr[arr.length-1];
                                    count++;
                                    break;
                        case 1 : brr[1]=arr[arr.length-2];
                                    count++;
                                    break;
                        case 2 : count=5;
                        break;
                    }
                    if(count==5){
                        break;
                    }
                    

        }
        
     return brr;
    }

    private static void displayMap(Map<Integer, Integer> num) {
        for(Map.Entry<Integer,Integer> entry : num.entrySet()){
            System.out.println("Key ="  + entry.getKey() +
            ", Value = " + entry.getValue());
        }
    }
}
