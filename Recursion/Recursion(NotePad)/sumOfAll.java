import java.util.*;
public class sumOfAll{	
	public static void main(String []args){
	String word="123";
	int sum=sumOfSeperateWord(word);
	System.out.println(sum);
	}
public static int sumOfSeperateWord(String num){
		if(num==null || num.length()<=0){
			return Integer.parseInt(num);
				}
		return sumOfSeperateWord(num.substring(1))+num.charAt(0);
		}
}