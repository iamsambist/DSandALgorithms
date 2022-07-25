import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class RomanToInteger {
    /*
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
     */
   public static String inRoaman;
public static void main(String[] args) {
    Map<Character,Integer> roman =new HashMap<Character, Integer>()
    {{
         put('I', 1);
         put('V', 5);
         put('X', 10);
         put('L',50);
         put('C',100);
         put('D',500);
         put('M',1000);
    }};
    Scanner sc=new Scanner(System.in);
    String name;
    System.out.println("Enter Roman Currency");
    name=sc.nextLine();
    inRoaman=reverseBaby(name);
    int previous=0;
    int present=0;
    int sum=0;
   
    for(int i=0;i<inRoaman.length();i++){
        char ch=inRoaman.charAt(i);
        present=roman.get(ch);
        boolean check=valueIsGrater(previous,present);
        if(check==true){
                
                previous=present;
                sum=sum+present;
        }
        else{
            sum=sum-present;
        }
    }
    System.out.println(sum);

    
   

}
public static boolean valueIsGrater(int previous,int present){
    if(present >= previous){
        return true;
    }
    else{
        return false;
    }
}
public static String reverseBaby(String Name){
    Stack<Character> stack=new Stack<>();
    String rev="";
    char ch;
    for(int i=0;i<Name.length();i++){
        char c=Name.charAt(i);
        stack.push(c);
    }
    while(stack.isEmpty()==false){
            ch=stack.pop();
            rev=rev+ch;
    }
    return rev;
}
}
    
