import java.util.Scanner;
class Node{
    int info;
    Node next;
}

public class Implementation{
   static Node head;
   static Node ptr;
   static Node preptr;
   static int key;
   static boolean searchCheck;
   static int numberToInsert;
       public Implementation(){
             head=null;
        }
    public static void insertAtFirst(int num){
            Node newNode=new Node();
            if(head==null){
                newNode.info=num;
                head=newNode;
            }
            else{
                newNode.info=num;
                newNode.next=head;
                head=newNode;
            }
    }
    
    public static void insertAtLast(int num){
        Node newNode=new Node();
        ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        newNode.info=num;
        newNode.next=null;
    }
    public static void insertAnywhere(int num,int key){
            ptr=head;
            preptr=head;
            while(ptr.info!=key){
                
                if(ptr.next==null){
                    System.out.println("Element with key doesn't Exist");
                    break;
                }
                preptr=ptr;
                ptr=ptr.next;
            }
            Node newNode=new Node();
            newNode.info=num;
            newNode.next=ptr;
            preptr.next=newNode;
    }
    public static void display(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
                ptr=head;
                System.out.print("[");
                while(ptr.next!=null){
                    System.out.print(" "+ptr.info);
                    ptr=ptr.next;
                }
                System.out.print(" "+ptr.info+" "+"]");
        }
    }
    public static void deleteNodeAtFirst(){
        if(head==null){
            System.out.println("Empty list");
        }
        else{
            ptr=head;
            head=ptr.next;
        }
    }
    public static void searchElement(int key){
        if(head==null){
            System.out.println("NO list found");
        }
        else{
            ptr=head;
            while(ptr.info!=key){
                if(ptr.next==null){
                    searchCheck=false;
                    break;
                }
                ptr=ptr.next;
            }
            searchCheck=true;
        }
    }
    public static void main(String[] args) {
        int ot=1;
        Scanner sc=new Scanner(System.in);
        Implementation lnlist=new Implementation();
      
        while(ot==1){
            System.out.println("1 to insert at first\n2 at last\n3 anywhere");
            System.out.println("4 delete node\n 5 search element");
            System.out.println("6 display\n0 to exit");
            int check=sc.nextInt();
            switch(check){
                case 1: 
                    System.out.println("Enter Element to Insert");
                    numberToInsert=sc.nextInt();
                    insertAtFirst(numberToInsert);
                    System.out.println("Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter Element to Insert");
                    numberToInsert=sc.nextInt();
                    insertAtLast(numberToInsert);
                    System.out.println("Added Successfully");
                    break;
                case 3:
                    System.out.println("Enter Element to Insert and Key Before to Insert");
                    numberToInsert=sc.nextInt();
                    key=sc.nextInt();
                    insertAnywhere(numberToInsert,key);
                    System.out.println("Added Successfully");
                    break;
                case 4:
                    deleteNodeAtFirst();
                    System.out.println("Deleted SucessFully");
                    break;
                case 5:
                    System.out.println("Enter Element to search");
                    numberToInsert=sc.nextInt();
                    searchElement(numberToInsert);
                    if(searchCheck==true){
                        System.out.println("Element "+numberToInsert+ " present in the list");
                    }
                    else{
                        System.out.println("Sorry couldn't found "+numberToInsert);
                    }
                    break;
                case 6:
                    display();
                    break;
                case 0:
                    ot=0;
                    break;
            }
        }
    }
}