/*
 for Binary Search elements should be sorted
 it has a time complexity of O(log n)
 works on divide and conquor method
 */

public class ImplementingBinarySearch {
    public static void binarySearch(int x,int arr[]){
            int low=0;
            int high=arr.length-1;
            int mid=(high+low)/2;
                while(low<=high){
                    if(x<arr[mid]){
                        high=mid-1;
                    }
                     else if(x==arr[mid]){
                        System.out.println("Found element at Index Number="+mid);
                        break;
                     }
                     else{
                        low=mid+1;
                     }
                     mid=(high+low)/2;
                     if(low>high){
                        System.out.println("element not found");
                     }

                }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        /*
         * Suppose we wanna to search element 8 from above array arr
         * pass the element alog with array
         */
        ImplementingBinarySearch.binarySearch(2,arr);
    }
}
