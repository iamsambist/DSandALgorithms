public class ReverseList{
   static Node head=null;
   class Node{
      int data;
      Node next;
      public Node(int data){
         this.data=data;
         this.next=null;   }
   }
   public static void main(String[] args) {
      ReverseList list=new ReverseList();
      list.pushNode(10);
      list.pushNode(10);
      list.pushNode(52);
      list.pushNode(51);
      list.pushNode(56);
      list.pushNode(58);
      list.printNode();
      list.printMiddle();
      list.printMiddlepart2();
      head=list.reverseList(head);
      list.printNode();
      list.deleteNthNodeFormEnd(3);
      list.printNode();
      
      
   }
   private void deleteNthNodeFormEnd(int m) {
      int nodefromStart=getLength()-m;
      Node ptr=head;
      while(nodefromStart>1){
            ptr=ptr.next;

            nodefromStart--;
      }
      ptr.next=ptr.next.next;
      System.out.println("Node Deleted");

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
public void printMiddle(){
   Node fastptr=head;
   Node slowptr=head;
   while(  fastptr!=null && fastptr.next!=null){
      fastptr=fastptr.next.next;
      slowptr=slowptr.next;
   }
   System.out.println("The Middle Element is "+slowptr.data);
}
public void printMiddlepart2(){
   Node temp=head;
   int gotomiddle=getLength()/2;
   while(gotomiddle!=0){
      temp=temp.next;
      gotomiddle--;
   }
   System.out.println("The Middle Element is "+temp.data);
}
public Node reverseList(Node node){
   Node noe=null;
   if(head==null){
     return null;
   }
   if(head.next==null){
      return head;
   }
   Node pre=null;
   Node cur=node;
   Node next=null;
   while(cur!=null){
      next=cur.next;
      cur.next=pre;
      pre=cur;
      cur=next;
   }
noe=pre;
return noe;
}
}
