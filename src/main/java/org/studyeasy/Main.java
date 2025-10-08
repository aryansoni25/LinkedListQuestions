package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        LinkedList node1=new LinkedList();
        node1.createLL(3);
        node1.insert(5);
        node1.insert(1);
        node1.insert(9);
        node1.traverse();
        Questions temp=new Questions();

        LinkedList node2=new LinkedList();
        node2.createLL(5);
        node2.insert(6);
        node2.insert(7);
        node2.insert(2);
        node2.insert(9);
        node2.traverse();
        temp.deleteDups(node1);
        node1.traverse();
        Node n1=temp.NthToLast(node1,4);
        System.out.println(n1.value);
        temp.partition(node1,8);
        node1.traverse();
        LinkedList result=temp.sumList(node1,node2);
        result.traverse();
        temp.addSameNode(node1,node2,7);
        temp.addSameNode(node1,node2,3);
        temp.addSameNode(node1,node2,4);
        Node inter= temp.findIntersection(node1,node2);
        System.out.println(inter.value);
    }
}