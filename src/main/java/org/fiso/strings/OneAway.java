package org.fiso.strings;

public class OneAway {

    public static void main(String ...args){


        System.out.println("pale is one away from ple : "+ oneAway("pales", "ples"));
        System.out.println("pales is one away from pale : "+ oneAway("pales", "pale"));
        System.out.println("pales is one away from pale : "+ oneAway("paxle", "pale"));
        System.out.println("pale is one away from bale : "+ oneAway("pale", "bale"));
        System.out.println("pale is one away from bake : "+ oneAway("pale", "bake"));
        System.out.println("aaa is one away from a : "+ oneAway("aaa", "a"));
        System.out.println("ab is one away from ba : "+ oneAway("ab", "ba"));
    }


    /***
     * One Away: There are three types of edits that can be performed on strings: insert a character,
     * remove a character, or replace a character. Given two strings, write a function to check if they are
     * one edit (or zero edits) away.
     * EXAMPLE
     * pale, ple -> true
     * pales, pale -> true
     * pale, bale -> true
     * pale, bake -> false
     * Hints:#23, #97, #130
     *
     * */
    public static boolean oneAway(String s1, String s2){
         int i = 0;
         int j = 0;
         int diff = 0;

         while(i < s1.length() || j < s2.length()){

             if(j >= s2.length()){
                 while(i < s1.length()){
                     diff++;
                     i++;
                 }
                 break;
             }else if(i >= s1.length()){

                 while(j < s2.length()){
                     diff++;
                     j++;
                 }
                 break;
             }


             if(s1.charAt(i) != s2.charAt(j)){

                if(s1.length() > s2.length())
                    i++;
                else if(s1.length() < s2.length() ){
                    j++;
                }else{
                    j++;
                    i++;
                }
                diff++;
                 continue;
             }
             j++;
             i++;
         }
         return diff <= 1;
    }

}
