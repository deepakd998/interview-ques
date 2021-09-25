package com.dkd.linkedlist;

public class IntersectionLinkedList {
    public static void main(String[] args) {
        Node head1= new Node(3);
        head1.next=new Node(6);
        head1.next.next=new Node(9);
        Node head2=new Node(8);
        head2.next=head1.next.next;
        head2.next.next=new Node(10);
        System.out.println(findIntersection(head1,head2));
    }

    private static Node findIntersection(Node head1, Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;
        if(ptr1==null || ptr2==null)return null;
        while (ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
            if(ptr1==ptr2){
               return ptr1;
            }
            if(ptr2==null){
                ptr2=head1;
            }
            if(ptr1==null){
                ptr1=head2;
            }
        }
    return ptr1;
    }

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
