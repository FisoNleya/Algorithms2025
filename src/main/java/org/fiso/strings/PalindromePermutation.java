package org.fiso.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PalindromePermutation {

    public static void main(String[] args){
     System.out.println("The string has palindrome pemutation "+ hasPalindromePermutation("taco cat"));
     System.out.println("The string has palindrome pemutation "+ hasPalindromePermutation("abbc"));
     System.out.println("The string has palindrome pemutation "+ hasPalindromePermutation("abb"));
     System.out.println("The string has palindrome pemutation "+ hasPalindromePermutation("abba"));
    }


    /***
     * 1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
     * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
     * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
     * EXAMPLE
     * Input: Tact Coa
     * Output: True (permutations: "taco cat", "atco eta", etc.)
     * Hints: #106, #121, #134, #136
     *
     * */
    private static boolean hasPalindromePermutation(String s){

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            char val = arr[i];
            if(val == ' ')
                continue;

            if(st.isEmpty() || st.peek() != val){
                st.push(val);
            }else if (st.peek() == val){
                st.pop();
            }

        }

        return st.size() < 2;
    }
}
