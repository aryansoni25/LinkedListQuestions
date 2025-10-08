package org.studyeasy;

import java.util.HashSet;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue){

        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        tail=node;
        head=node;
        size=1;
    }

    public void insert(int nodeValue){
        if (head == null) {
            createLL(nodeValue);
            return;
        }
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        tail.next=node;
        tail=node;
        size++;
    }

    public void traverse(){
        Node temp=head;
        int index=0;
        while (index<size){
            System.out.print(temp.value);
            temp=temp.next;
            index++;
            if(temp!=tail.next){
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

}
