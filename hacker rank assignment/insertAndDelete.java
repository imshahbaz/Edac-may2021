import java.io.*;
import java.util.*;

public class insertAndDelete {

    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.insert(8);
        list.insert(20);
        list.insert(6);
        list.insert(2);
        list.insert(19);
        list.insert(7);
        list.insert(4);
        list.insert(15);
        list.insert(9);
        list.insert(3);
        list.deleteList();
        list.show();
        
    }
}
 class Node {
    int data;
    Node next; //self referntial structure

}
class LinkedList {
    Node head;
    
    public void insert(int data)        //insert at end
    {
        Node node=new Node();          //create a new node
        node.data=data;                //assign data
        node.next=null;               //assign null
        
        if(head==null) 
        {
            head=node;
        }
        else
        {   
            Node n=head;              //for traverse
            while(n.next!=null)       //check n.next is null or not
            {
                n=n.next;             //n points to next node
            }
            n.next=node;              //if null, n.next points to node
        }
    }
    public void deleteList() {
        head=null;
        System.out.println("Linked list deleted");
    }
    public void show()
    {
        Node node=head;                                  //reference for traverse
        while(node!=null)                          // prints till n!=null
        {
            System.out.print(node.data);
            node=node.next;                            //node points to next(node)
        }
        
        
       
    }
}