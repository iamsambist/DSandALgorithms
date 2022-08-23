import java.util.Arrays;
public class PQScratch {
 int arr[]=new int[5];
 int count;
  // number of items in a Queue Each time adding element Count should increased by 1

    public void add(int item) {
        int i;
        for(i=count-1; i>=0 ; i--){
            if(arr[i] > item){
                arr[i+1]=arr[i];
            }
            else{
                break;
            }
        }
        arr[i+1]=item;
        count++;
    }
  @Override
  public String toString() {
      
      return Arrays.toString(arr);
  }
public int remove() {
    if(count==0){
       throw new IllegalStateException();
    }
return arr[--count];
}

// removing element with given key suppose int 3
public void remove(int num){
    int i;
    int hold;
    boolean check=false;
    for(i=0; i>=4; i++){
        check=(arr[i]==num);
        if(check){
           hold=arr[i+1];
           arr[i]=hold; 
        }
    
    }
}

    
}
