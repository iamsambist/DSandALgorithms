import java.util.Stack;
public class Practise1 {
    public static void main(String[] args) {
        Practise2 p1=new Practise2(21, 3);
        Practise2 p2=new Practise2(20, 2);
        Stack<Practise2> stack=new Stack<>();
        stack.push(p1);
        stack.push(p2);
        System.out.println("Objects :"+stack);
    }
}
