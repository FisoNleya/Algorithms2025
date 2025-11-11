package org.fiso.stacksandqueues;

import java.util.Stack;

public class SortStack {

    public static void main(String... args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(12);
        stack.push(7);
        stack.push(4);
        stack.push(9);
        stack.push(6);
        print(stack);
        sortStack(stack);
        System.out.println("0-------->");

    }


    public static void print(Stack<Integer> stack) {
        for (Integer i : stack) {
            System.out.print(i + "->");
        }
        System.out.println();
    }

    public static void sortStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        temp.push(s.peek());

        int size = s.size();

        for (int i = 0; i < size && temp.size() < size; i++) {

            Integer val = s.get(i);

            if (!temp.contains(val)) {

                while (!temp.isEmpty() && temp.peek() < val) {
                    temp.pop();
                }
                temp.push(val);

            }

            if (i == (size - 1))
                i = -1;
        }


        print(temp);

    }
}
