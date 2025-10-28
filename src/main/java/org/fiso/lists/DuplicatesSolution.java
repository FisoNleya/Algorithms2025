package org.fiso.lists;

import java.util.*;

public class DuplicatesSolution {

    public static void main(String ...args ){

        List<Integer> res = removeDuplicates(List.of(1,2,6,2,6,4,1));
        System.out.println("The res : "+ res.toString());
    }


    /**
     *
     * Remove Dups! Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP
     * How would you solve this problem if a temporary buffer is not allowed?
     * Hints: #9, #40
     *
     *
     * */
    public static List<Integer> removeDuplicates(List<Integer> l){
        Set<Integer> set = new HashSet<>(l);
        return new ArrayList<>(set);
    }

}
