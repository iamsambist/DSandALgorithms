public class CheckPalindrome {
    public static Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
           this.data=data;
           this.next=null;   }
     }
    public static void main(String[] args) {
        CheckPalindrome list=new CheckPalindrome();
        list.pushNode(1);
        list.pushNode(2);
        list.pushNode(2);
        list.pushNode(1);
        boolean check=checkpalindrome();

        
    }
    public boolean checkpalindrome(){
       
        if(head.next==null) 
        {
            return true;
        }
        Node startPtr=head;
        Node endPtr=head;
            while(endPtr.next==null){
                endPtr=endPtr.next;
            }
            while(startPtr<=en)

        
    }
    public void pushNode(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
     }
     public void printNode(){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+"-> ");
           temp=temp.next;
        }
        System.out.println("Null");
     }
     private int getLength(){
        Node temp=head;
        int count=0;
        while(temp!=null){
           
           ++count;
           temp=temp.next;
        }
        return count;
     }
}
