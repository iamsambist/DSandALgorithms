import java.util.LinkedList;

public class Operation {
    public static void main(String[] args) {
        String num1,num2;
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);

        // converting linked list into array
        for(int i=l1.size()-1;i>=0;i--)
        {
            num1=String.valueOf(l1.get(i));
        }
    }
}
