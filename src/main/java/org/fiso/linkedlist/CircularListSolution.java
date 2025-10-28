package org.fiso.linkedlist;

public class CircularListSolution {

    public static void main(String ...args ){


        //2-> 4-> 6-> 8-> 9 -> 2-> 4-> 6-> 8->9
        Node l = new Node(2);
        l.head = l;
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(9);

        Node tail = l.tail;
        tail.next = l.head;

        Node node =  detectLoop(l);
        if(node == null)
            System.out.println("Loop was not detected");

        else{
            System.out.println("Loop detected at : "+node.value);
        }



    }

    public static Node detectLoop(Node l){

        Node head = l.head;

        Node slow = head;
        Node fast = head;
        while(slow.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return slow;
        }

        return null;
    }

}
