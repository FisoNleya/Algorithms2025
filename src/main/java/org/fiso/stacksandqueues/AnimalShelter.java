package org.fiso.stacksandqueues;

import java.util.LinkedList;

public class AnimalShelter {

    private final LinkedList<Animal> queue = new LinkedList<>();

    public void enqueue(Animal animal){
        queue.addFirst(animal);
    }


    public void dequeueAny(){
        queue.remove();
    }


    public void dequeueDog(){
        int removalIndex = 0;
        if(queue.isEmpty())
            throw new RuntimeException("Queue is already empty");

        for(int i = 0; i < queue.size(); i++){

            Animal animal = queue.get(i);

            if(animal.type == Type.DOG)
                removalIndex = i;
        }


        queue.remove(removalIndex);
    }


    public void dequeueCat(){
        int removalIndex = 0;
        if(queue.isEmpty())
            throw new RuntimeException("Queue is already empty");

        for(int i = 0; i < queue.size(); i++){

            Animal animal = queue.get(i);

            if(animal.type == Type.CAT)
                removalIndex = i;
        }

        queue.remove(removalIndex);
    }

    public void print(){
        queue.forEach(v->System.out.print(v.value+"."+v.type+"->"));
        System.out.println();
    }


    public static void main(String ...args){

        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Animal(1, Type.DOG));
        shelter.enqueue(new Animal(2, Type.DOG));
        shelter.enqueue(new Animal(3, Type.CAT));
        shelter.enqueue(new Animal(4, Type.DOG));
        shelter.enqueue(new Animal(5, Type.CAT));
        shelter.enqueue(new Animal(6, Type.DOG));

        shelter.print();
        System.out.println("---------");
        shelter.dequeueDog();
        shelter.print();
        System.out.println("---------");
        shelter.dequeueCat();
        shelter.print();
        System.out.println("---------");
        shelter.dequeueAny();
        shelter.print();


    }



}
