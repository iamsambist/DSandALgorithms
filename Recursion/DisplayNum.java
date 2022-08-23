import java.util.Scanner;

public class DisplayNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        DisplayNum run=new DisplayNum();
       run.displayUpToNum(num);
    }

    private void displayUpToNum(int num) {
        if( num > 0) {
            System.out.print(" "+num);
            displayUpToNum(num-1);
        }
    }
}
