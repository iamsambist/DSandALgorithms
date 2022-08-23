public class StringReverse{
public static void main(String args[]){
    String name="Sunil Singh Bist";
 	System.out.println(reverseString(name));		
   }
public static String reverseString(String name){
	if(name==null || name.length()<=1){
		return name;
		}
return reverseString(name.substring(1))+name.charAt(0);
	}
}