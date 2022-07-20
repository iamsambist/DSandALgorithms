public class TwoStack1Array{
    private int[] arr;
    private int top1;
    private int top2;
    private int size;
       public TwoStack1Array(int n){
        size=n;
            arr=new int[n];
            top1=-1;
            top2=n;       
        }
        public void push1(int x){
            if(top1<(top2-1)){
                arr[++top1]=x;
            }
            else{
                System.out.println("Stack Overflow");
                System.exit(0);
                // exit function will terminate the currently running jvm 
            }
        }
        public void push2(int x){
            if(top1<(top2-1)){
                arr[--top2]=x;
            }
            else{
                System.out.println("Stack Overflow");
                System.exit(0);
                // exit function will terminate the currently running jvm 
            }
        }
        public void show1(){
            int run=top1;
                while(run>=0){
                    System.out.print(" "+arr[run]);
                    run--;
                }
        }
        int pop2()
        {
            if (top2 < size) {
                int x = arr[top2];
                top2++;
                return x;
            }
            else {
                System.out.println("Stack Underflow");
                System.exit(1);
            }
            return 0;
        }
    public static void main(String[] args) {
        TwoStack1Array myArray=new TwoStack1Array(10);
        myArray.push1(5);
        myArray.push1(6);
        myArray.show1();
    }
}