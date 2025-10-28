package org.fiso.linkedlist;

public class LinkedListSolution {

    public static void main(String ...args ){

        //2-> 4-> 6-> 8->9
        Node l = new Node(2);
        l.head = l;
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(9);

      int k = 3;
      Node kthNode = returnToKthLast(l, k);
      System.out.printf("The %d element from the list : val = %d ", k, kthNode.value);

    }

    public static Node returnToKthLast(Node l, int kValue){
          int i = 1;

          Node kthNode = null;

          Node currNode = l.head;
          while(currNode.next != null){

              if(i == kValue && kthNode == null){
                  kthNode = l.head;
                  kthNode = kthNode.next;
              }else if( kthNode != null){
                  kthNode = kthNode.next;
              }
              i++;
              currNode = currNode.next;
          }


          return kthNode;
    }


}
