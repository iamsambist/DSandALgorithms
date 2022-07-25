import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
           /*
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
     */
        Scanner sc=new Scanner(System.in);
        int roman=sc.nextInt();
        Map<Integer,Character> pair=new HashMap<>(){{
            put(1, 'I');
            put(5,'V');
            put(10,'X');
            put(100,'C');
            put(50,'L');
            put(500,'D');
            put(1000,'M');
        }};
        ArrayList<Character> list=new ArrayList<>();
        int nums[]={1,5,10,50,100,500,1000};
        for(int i=nums.length-1;i>=0;i--){
            while(roman>=nums[i]){
                roman=roman-nums[i];
                list.add(pair.get(nums[i]));
            }
        }
        System.out.println(list);
    }
}
