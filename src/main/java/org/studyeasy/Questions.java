package org.studyeasy;
import java.util.HashSet;

public class Questions {
    public void deleteDups(LinkedList ll){
        HashSet<Integer> set=new HashSet();
        Node current= ll.head;
        Node previous=null;
        while(current!=null){
            int curval= current.value;
            if(set.contains(curval)){
                previous.next=current.next;
                ll.size--;
            }else{
                set.add(curval);
                previous=current;
            }
            current=current.next;
        }
    }

    public Node NthToLast(LinkedList ll,int location){
        Node p1= ll.head;
        Node p2=ll.head;
        for(int i=0;i<location;i++){
            if(p2==null){
                return null;}
                p2=p2.next;
        }while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }

    public LinkedList partition(LinkedList ll,int x){
        Node current= ll.head;
         ll.tail= ll.head;
        while (current!=null){
            Node next=current.next;
            if(current.value<x){
                current.next=ll.head;
                ll.head=current;
            }else{
                ll.tail.next=current;
                ll.tail=current;
            }
            current=next;
        }
        ll.tail.next=null;
        return ll;
    }

    LinkedList sumList(LinkedList lla,LinkedList llb){
        Node n1=lla.head;
        Node n2= llb.head;
        int carry=0;
        LinkedList resultLL=new LinkedList();
        while(n1!=null ||n2!=null){
            int result=carry;
            if(n1!=null){
                result+=n1.value;
                n1=n1.next;
            }if(n2!=null){
                result+=n2.value;
                n2=n2.next;
            }
            resultLL.insert(result%10);
            carry=result/10;
        }
        return resultLL;
    }

    public Node getKthNode(Node head,int k){
        Node current=head;
        while(k>0 && current!=null){
            current=current.next;
            k--;
        }
        return current;
    }


    public Node findIntersection(LinkedList list1,LinkedList list2){
        if(list1.head==null ||list2.head==null){
            return null;
        }
        if(list1.tail!=list2.tail){
            return null;
        }
        Node longer=new Node();
        Node shorter=new Node();
        if(list1.size>list2.size){
            longer=list1.head;
            shorter=list2.head;
        }else{
            shorter=list1.head;
            longer=list2.head;
        }

        longer=getKthNode(longer,Math.abs(list1.size- list2.size));
        while(shorter!=longer){
            shorter=shorter.next;
            longer=longer.next;
        }
        return longer;
    }

    public  void addSameNode(LinkedList lla,LinkedList llb,int nodeValue){
        Node node=new Node();
        node.value=nodeValue;
        lla.tail.next=node;
        lla.tail=node;
        llb.tail.next=node;
        llb.tail=node;
    }
}
