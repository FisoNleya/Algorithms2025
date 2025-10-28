package org.fiso.linkedlist;

class Node{

    Node next;
    Node head;
    Node tail;
    int value;

    public Node(int value){
        this.value = value;
    }

    public void add(int value){
        Node newNode = new Node(value);
          if(head ==null){
              head =  newNode;
          }

          Node currNode = head;
          while(currNode.next != null){
              currNode = currNode.next;
          }

        currNode.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null)
            throw new IllegalStateException("Carnot print an empty linked list");

        Node currNode = head;
        while(currNode.next != null){
            System.out.printf(currNode.value+" -> ");
            currNode = currNode.next;
        }
        System.out.println(currNode.value+" -> ");
    }


}