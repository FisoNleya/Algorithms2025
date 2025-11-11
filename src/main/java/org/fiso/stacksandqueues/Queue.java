package org.fiso.stacksandqueues;

public class Queue<T> {

   class QueueNode<T>{

       T data;
       QueueNode<T> next;

       QueueNode(T t){
           this.data = t;
       }

   }

    QueueNode<T> last;
    QueueNode<T> first;


    Queue(QueueNode<T> t){
        first = t;
        last = t;
    }

    public void add(QueueNode<T> node){
        last.next = node;
        last = node;
    }


    public void remove(){

        QueueNode temp = first;

        if(first.next == null)
            first = null;
        else{
            first = first.next;
            first.next = null;

        }

    }

}
