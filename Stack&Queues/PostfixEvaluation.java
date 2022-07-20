import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
       String exp="231*+9-";
       for(int i=0;i<exp.length();i++){
        char c=exp.charAt(i);
        if(Character.isDigit(c)){
            stack.push(c - '0');
        }
        else{
            int op1=stack.pop();
            int op2=stack.pop();
            switch (c) {
                case '+':
                    stack.push(op1+op2);
                    break;
                case '-':
                  stack.push(op2-op1);
                   break;
                   case '*':
                   stack.push(op1*op2);
                   break;
                   case '/':
                   stack.push(op1/op2);
                   break;
            }
        }
       }
       System.out.println("Ans="+stack.pop());
    }
    
}
