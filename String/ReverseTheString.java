import java.util.Scanner;
import java.util.Stack;

public class ReverseTheString{
    public static void main(String[] args) {
        String Name;
        String rev="";
        char ch;
        Scanner sc=new Scanner(System.in);
        Name=sc.nextLine();
        sc.close();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<Name.length();i++){
            char c=Name.charAt(i);
            stack.push(c);
        }
        while(stack.isEmpty()==false){
                ch=stack.pop();
                rev=rev+ch;
        }
        System.out.println(rev);
    }
}