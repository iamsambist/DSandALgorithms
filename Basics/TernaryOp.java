import java.util.Scanner;

public class TernaryOp{

    public static void main(String[] args) {
        // Finding maximum Number Between 2 Numbers
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=(a>b) ? a : b;
        System.out.println(max);
    }
}