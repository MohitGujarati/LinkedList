package C1_LinkedList;

/*
public class LinkedLIst
{
    //Node of a linked list

   static class Node{
        int data;
        Node next;

        Node(int x)
        {
            data=x;
            next=null;
        }
    }

    //Traversing and printing the Linked list
    static void printLL(Node head) {
        Node current =head;
        while(current != null){
            System.out.println(current.data+" ");
            current=current.next;
        }

    }

    //Insert Element at the beginning of the node
    static Node insert_Begin(Node head, int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }

    //Insert element at the end
    static Node insertEnd(Node head,int x){

       Node temp=new Node(x);
       if (head==null)return temp;
       Node curr=head;
       while(curr.next!=null){
           curr=curr.next;
       }
       curr.next=temp;
       return head;
    }

    //Deleting the first node
    static Node DelNode(Node head){
       if (head==null) return null;
       else {
           return head.next;
       }
    }

    //deleting the lastNode
    static Node DelTail(Node head) {
        if(head==null)return null;
        if(head.next==null)return null;
        Node curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;

    }



    public static void main(String[] args) {

//        Node head=new Node(10);
//        Node temp1=new Node(20);
//        Node temp2=new Node(30);
//
//        head.next=temp1;
//        temp1.next=temp2;
//        //simply printing the LL manually
//     //  System.out.print(head.data+"-->"+temp1.data+"-->"+temp2.data);
//
//
// simple inserting elements


            Node head=null;
            head= insert_Begin(head,40);
            head= insert_Begin(head,30);
            head= insert_Begin(head,20);

            // we deleted the first element in the LL
               head=DelNode(head);

            //deleting the last element in the LL
              head=DelTail(head);

        printLL(head);
        System.out.println();
        System.out.println("Inserted node at the end");
           //   Node head=null;

            head=insertEnd(head,10);
            head=insertEnd(head,20);
            head=insertEnd(head,30);

            //Traversing the linked list and printing it
              printLL(head);
    }}

 */ //Operation in Singly LinkedList

/*
class Node{
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data=d;
        prev=null;
        next=null;
    }
}
class Test{
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=insertBegin(head,4);
        head=insertBegin(head,5);
        head=insertEnd(head,40);
        head=insertEnd(head,50);
        head=delHead(head);
        head=delEnd(head);
        head=reverse(head);
        print(head);

    }

    static void print(Node head){
        Node current=head;
        while(current!=null) {
            System.out.println(current.data+" ");
            current=current.next;
        }


    }

    static Node insertBegin(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        if (head!=null)
            head.prev=temp;
        return temp;
    }

    static Node insertEnd(Node head,int data){
        Node temp =new Node(data);
        if (head==null)
            return temp;
        Node cur=head;

        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=temp;
        temp.prev=cur;
        return head;
    }

    static Node delHead(Node head)
    {
        if (head==null) return null;
        if (head.next==null)return null;

        else {
        head=head.next;
        head.prev=null;
        return head;
        }
    }

    static Node delEnd(Node head){
        if (head==null)return null;
        if (head.next==null)return null;

        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.prev.next=null;
        return head;
    }

    static Node reverse(Node head){
        if (head==null || head.next==null)
            return head;

        Node prev=null,cur=head;

        while(cur!=null){
            //Swapping the pointers next and prev
            prev=cur.prev;
            cur.prev=cur.next;
            cur.next=prev;
            cur=cur.prev;
        }
        return prev.prev;
    }


}

 *///Operation in Double LinkedList

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
class test{
    public static void main(String[] args) {
            Node head =new Node(10);
            head.next =new Node(11);
            head.next.next =new Node(12);
            head.next.next.next =new Node(13);
            head.next.next.next.next =head;
            head =insertBegin(head,15);
            head = insert_End(head,16);
            head=delhead(head);//15 is deleted
            head=delKelemnt(head,2);// 11 deleted
            printCLL(head);

            return ;
        }

        static void printCLL(Node head){

            if (head==null) return;
            System.out.println(head.data+" ");

            for (Node i=head.next;i!=head;i=i.next){
                System.out.println(i.data+" ");
            }

    }

    static Node insertBegin(Node head,int x){
        Node temp=new Node(x);

        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            //inserting new head(15)
            temp.next=head.next;
            head.next=temp;
            //swapping 10-->15
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return head;
        }
    }
    static Node insert_End(Node head,int x){
        Node temp=new Node(x);

        if (head==null){
            temp.next=temp;
            return temp;
        }
        else {
            temp.next=head.next;
            head.next=temp;

            int t=temp.data;
            temp.data=head.data;
            head.data=t;

            return temp;
        }
    }

    static Node delhead(Node head){

        if (head==null)return null;
        if (head.next==null) return null;


        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }

    static Node delKelemnt(Node head,int k){
        if (head==null) return head;

        if (k==1) return delhead(head);

        Node cur=head;
        for (int i=0;i<k-2;i++)
            cur=cur.next;

            cur.next=cur.next.next;
            return head;

    }

}

 *///Operation in Circular linked list

/*
class Node {
    int data;
    Node prev;
    Node next;
    Node(int d){
        data=d;
        prev=null;
        next=null;
    }
}
class test{
    public static void main(String args[])
    {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp2.prev=temp1;
        temp1.prev=head;
        head.prev=temp3;
        temp3.next=head;
        temp3.prev=temp2;
        head=insertAtHead(head,5);


        printlist(head);

    }

    public static void printlist(Node head){
            if(head==null)return;
            Node r=head;
            do{
                System.out.println(r.data+" ");
                r=r.next;
            }while(r!=head);
        }

        static Node insertAtHead(Node head,int x){
            Node temp=new Node(x);
            if(head==null){
                temp.next=temp;
                temp.prev=temp;
                return temp;
            }
            temp.prev=head.prev;
            temp.next=head;
            head.prev.next=temp;
            head.prev=temp;
            return temp;
        }


    }

 *///Circular doubly LL

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data=x;
        next=null;
    }

    //MAIN
    public static void main(String[] args) {

        Node head=new Node(1);
        Node temp1=new Node(2);
        Node temp2=new Node(3);
        Node temp3=new Node(4);
        Node temp4=new Node(5);
        Node temp5=new Node(6);
        Node temp6=new Node(7);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;
        temp5.next=temp6;

        printMiddle(head);
        NthNodefromend(head,3);
//        printlist(revLL(head));;
//        printlist(revLLinEffway(head));;
//        printlist(recrevLL(head));
        head=recrevLL2(head,null);
        printlist(head);


    }

    //MOST IMP QUESTIONS

    //find Middle node
    static void printMiddle(Node head){
        if (head==null) return;
        Node slow=head;Node fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        System.out.println(slow.data);
    }

    //print list
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

    //find Nth node from end
    static void NthNodefromend(Node head,int n){
        int len=0;
        for (Node cur=head;cur!=null;cur=cur.next)
            len++;
        if (len<n)return;

        Node cur=head;
        for (int i=0;i<len-n+1;i++)
            cur=cur.next;
        System.out.println(cur.data);

    }

    //reverse Linked list
    static  Node revLL(Node head) {

        // traversing the linked list and adding element in arraylist
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (Node cur=head;cur!=null;cur=cur.next){
            a.add(cur.data);
        }
        // Traversing LL copy the last item of the Arraylist in our Node
        // and remove Last item
        for (Node cur=head;cur!=null;cur=cur.next)
            cur.data=a.remove(a.size()-1);
            return head;
    }

    //reverse a LL efficient  way
    static Node revLLinEffway(Node head){

            Node curr=head;
            Node prev=null;
            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }

    //recursive code for revLL
    static  Node recrevLL(Node head ){
        if (head==null || head.next==null) return head;
        Node res_head=recrevLL(head.next);
        Node res_tail=head.next;
        res_tail.next=head;
        head.next=null;

        return res_head;
    }

    // recursive rev second method
    static  Node recrevLL2 (Node curr,Node prev ) {
        if (curr==null) return prev;
        //literally swapping the points
        Node next=curr.next;
        curr.next=prev;
        return recrevLL2(next,curr);

    }


}

 */ //imp sums

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data=x;
        next=null;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(50);
        head.next.next.next.next.next.next=new Node(50);
        head.next.next.next.next.next.next.next=new Node(60);
        removeDuplicate(head);
       printll(revIngrp(head,2)); ;

    }
    static void printll(Node head){
        Node cur=head;
        while (cur!=null){
            System.out.println(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    // remove duplicate
    static void removeDuplicate(Node head){
        Node cur=head;

        while (cur!=null && cur.next!=null)
        {
            if (cur.data==cur.next.data)
            {
                cur.next=cur.next.next;
            }
            else cur=cur.next;
        }
    }

    // recrev IN groups
    static Node revIngrp(Node head,int k){
        Node cur=head,next=null,prev=null;

        int count=0;

        while (cur!=null && count < k)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;

            count++;
        }
        if (next!=null){
            Node res_head=revIngrp(next,k);
            head.next=res_head;
        }
        return prev;
    }


}

 *///imp sums

/*

class Node{
    int data;
    Node next;

    Node (int x){
        data=x;
        next=null;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        Node temp1=new Node(2);
        Node temp2=new Node(3);
        Node temp3=new Node(4);
        Node temp4=new Node(5);
        Node temp5=new Node(6);
        Node temp6=new Node(7);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp2;
        temp5.next=temp6;
        System.out.println(detectlopp(head));;
        //if any node point to other prev node like in temp 4

    }

   static boolean detectlopp(Node head)
   {
        HashSet<Node> hs=new HashSet<Node>();

        for (Node cur=head;cur!=null;cur=cur.next){
            if (hs.contains(cur))
                return true;
            hs.add(cur);
        }
        return false;
   }
}

 *///detect a loop

















