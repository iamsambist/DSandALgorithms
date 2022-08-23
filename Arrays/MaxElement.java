

public class MaxElement{
    public static void main(String[] args) {
        System.out.println("Elements in array");
        int []arr={1,2,3,4,5,6,7};
       
        System.out.println(maxelement(arr));
    }
    public static int maxelement(int[] arr){
        int maxpose;
            int max=0;
        for(int i=arr.length-1;i>0;i--){
            maxpose=0;
            for(int j=1;j<=i;j++){
                    if(arr[j]>arr[maxpose]){
                        maxpose=j;
                    }
            }
            if(maxpose!=i){
                int temp=arr[maxpose];
                arr[maxpose]=arr[i];
                arr[i]=temp;
            }
            max=arr[maxpose];
            break;

            
        }
        return max;
    }
}