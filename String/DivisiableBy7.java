import java.util.Scanner;

public class DivisiableBy7 {
   static int hold,num1;
   static String sub;
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    boolean x=isdivisiable(name);
 }   
 public static  boolean isdivisiable(String name){
    for(int i=name.length();i>=0;i--){
      hold=2*(Character.getNumericValue(name.charAt(i-1)));
      sub=name.substring(i-3, i-2);
      num1=Integer.parseInt(sub);
      
      
      
   if(name.length()==2){
      if(Integer.parseInt(name)/7==0){
         return true;
      }
      else{
         return false;
      }
   }
}
    
    
    return true;

 }
}
