package org.fiso.strings;

import java.util.*;

public class ReplaceCharactersInString {

    public static void main(String[] args) {

        String input = "Mr John Smith    ";
        int truLength = 13;
        String res = replaceCharactersInString(input, truLength);
        System.out.println(res);
    }

    //Input: "Mr John Smith ", 13
    //Output:"Mr%20John%20Smith"

    //oh
    public static String replaceCharactersInString(String s , int length){

          char[] arr = s.toCharArray();

          // %20%20%20%20
          Deque<Character> que = new LinkedList<>();
          for(int i = 0; i < arr.length ; i++){
              System.out.println("Curr arr -> "+ Arrays.toString(arr));

              if(arr[i] == ' ' && !que.isEmpty()){
                  if(length > 0){
                      que.add('%');
                      que.add('2');
                      que.add('0');
                  }

                  arr[i] = que.remove();

              }else if(arr[i] == ' '&& que.isEmpty()){
                  arr[i] = '%';
                  if(length > 0){
                      que.addFirst('0');
                      que.addFirst('2');
                  }


              }else if(arr[i] != ' ' && !que.isEmpty()){
                  que.add(arr[i]);
                  arr[i] = que.remove();
              }

              length--;
          }


          return Arrays.toString(arr);

    }
}
