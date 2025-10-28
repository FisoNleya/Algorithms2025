package org.fiso.linkedlist;

public class PartitionSolution {

    public static void main(String ...args ){
        //3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
        Node l = new Node(3);
        l.head = l;
        l.add(5);
        l.add(8);
        l.add(5);
        l.add(10);
        l.add(2);
        l.add(1);

        int p = 5;

        System.out.println("Initially : ");
        l.print();
        partition(l, p);
        System.out.println("After : ");



        Node l2 = new Node(7);
        l2.head = l2;
        l2.add(1);
        l2.add(9);
        l2.add(8);
        l2.add(4);
        l2.add(8);
        l2.add(5);
        l2.add(2);
        l2.add(5);
        l2.add(10);
        l2.add(3);
        l2.add(1);


        int p2 = 5;

        System.out.println("Initially : ");
        l2.print();
        partition(l2, p2);
        System.out.println("After : ");

    }

    /***
     * Partition: Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
     * If x is contained within the list, the values of x only need to be after the elements less than x (see below).
     * The partition element x can appear anywhere in the "right partition";
     * it does not need to appear between the left and right partitions.
     *
     * EXAMPLE
     * Input:9 -> 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
     * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8 -> 9
     */

    public static Node partition(Node l, int p){

        Node currNode  = l.head;

        while(currNode.next != null){
            if(currNode.next.value < p){

                Node temp = currNode.next;
                currNode.next = currNode.next.next;


                temp.next = l.head;
                l.head =  temp;

                continue;
            }


            currNode = currNode.next;
        }

        l.print();

        return l;
    }

}
