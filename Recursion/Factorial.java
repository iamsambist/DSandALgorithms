import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    sc.close();
    System.out.println(factorial(num));
}
public static int factorial(int num){
    if(num==1) return 1;
    else{
        return num*factorial(num-1);
    }
}
}
