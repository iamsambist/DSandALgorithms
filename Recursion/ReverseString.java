import java.util.Scanner;

public class ReverseString {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        ReverseString run=new ReverseString();
        n=name.length();

        for(int j=n-1; j>=0 ;j--){
           char ch= run.getReverseString(name,j);
            System.out.println(ch);
        }
        

    }

    private char getReverseString(String name, int i) {
            char[]ch=new char[n];
            storeString(ch,name);
            
                getReverseString(name, i-1);
                return name.charAt(i);
            }

           
        
       

    private void storeString(char[] ch, String name) {
        for(int i=0;i < name.length(); i++){
            ch[i]=name.charAt(i);
        }

    }

    private void printarr(char[] ch) {
        for(int i=0;i<n;i++){
            System.out.print(" "+ch[i]);
        }
    }
}
