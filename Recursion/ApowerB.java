import java.util.Scanner;

public class ApowerB {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
       System.out.println(apowerb(a,b)); 
    }
    public static int apowerb(int a,int b){
        if(b==0) return 1;
        else{
            return a*apowerb(a, b-1);
        }
    }
}
