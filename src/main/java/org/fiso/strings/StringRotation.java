package org.fiso.strings;

import javax.xml.stream.events.Characters;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StringRotation {


    public static void main(String[]  args){
//     String s2 = "dex";
//     String s1 = "walkerdexsent";

        String s1 = "waterbottle";
        String s2 = "erbottlewat";

//     System.out.printf("%s is substring of %s : %s \n", s1, s2, isSubString(s1 ,s2));
     System.out.printf("%s is rotaion of %s : %s", s1, s2, isRotation(s1 ,s2));
    }

    public static boolean isRotation(String s1, String s2){

        String subOfTwo = s2.substring(0, 2);

        int index = isSubString(s1, subOfTwo) + 1;

        System.out.printf("returned index : "+index);


        Queue<Character> q = new LinkedList<>();
        for(int i = 2; i < s2.length(); i++){
            q.add(s2.charAt(i));
        }


        while(!q.isEmpty()){

            char charInS2 = q.peek();
            if(charInS2 != s1.charAt(index))
                return false;
            else
                q.remove();

            if(index == s1.length() -1){
                index = 0;
            }else{
                index++;
            }
        }

        return true;
    }

    public static int isSubString(String s1, String s2){

        System.out.printf("Checking if s2 : %s is substring of s1 : %s \n ", s2, s1);
        int a = 0;
        int b = s2.length()-1;

        while(b < s1.length()){
            String window = s1.substring(a, b+1);
            if(s2.equals(window))
                return b;
            a++;
            b++;
        }


        return -1;
    }

}
