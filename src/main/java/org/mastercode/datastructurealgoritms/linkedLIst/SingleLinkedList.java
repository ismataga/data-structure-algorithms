package org.mastercode.datastructurealgoritms.linkedLIst;

public class SingleLinkedList {
    public Node head;
    public Node tail;

    public int size;

    public Node createSingleLinkedList(int nodeValue) {
       head = new Node();
       Node node = new Node();
       node.next=null;
       node.value=nodeValue;
       head=node;
       tail=node;
       size=1;
       return head;
    }


    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value=nodeValue;
        if(head==null){
            createSingleLinkedList(nodeValue);
            return;
        } else if (location==0) {
            node.next=head;
            head=node;

        } else if (location>=size) {
            node.next=null;
            tail.next=node;
            tail=node;
        }else{
            Node temp=head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            Node nextNode = temp.next;
            temp.next=node;
            node.next=nextNode;
        }
        size++;
    }

}
