package com.dkd.linkedlist;

public class SurvivorInCircularLinkedListNode {
    static class Node
    {
        public int data ;
        public Node next;
        public Node( int data )
        {
            this.data = data;
        }
    }

    public static Node createCircularLinkedList(int n){
        Node head = new Node(1);
        Node tail = head;
        for(int i = 2; i <= n; i++)
        {
            tail.next = new Node(i);
            tail = tail.next;
        }
        tail.next = head;
        return head;
    }
    public static int findSurvivor(Node list){
        Node head=list;
        Node prev=list;
        while (head.next!=head){
            prev.next=head.next.next;
            head=prev.next;
            prev=head;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Node list=createCircularLinkedList(4);
        int data=findSurvivor(list);
        System.out.println(data);
    }
}

/*
[1,2,3,4,5,6,7]
survivor=7;
[1,2,3,4]
survivor=1
 */