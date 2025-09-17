package org.fiso.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "apc";
        String s2 = "pac";
        System.out.println(anagram(s1, s2));
    }


    public static  boolean anagram(String s1 , String s2){

        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0 ; i <= s1.length() -1; i++){
            char chaKey = s1.charAt(i);
            if(map1.containsKey(chaKey)){
              int val =  map1.get(chaKey);
              map1.put(chaKey, ++val);
            }else {
                map1.put(chaKey, 1);
            }
        }


        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0 ; i <= s2.length() -1; i++){
            char chaKey = s2.charAt(i);
            if(map2.containsKey(chaKey)){
                int val =  map1.get(chaKey);
                map2.put(chaKey, ++val);
            }else {
                map2.put(chaKey, 1);
            }

            if(!map1.containsKey(chaKey) || map2.get(chaKey) > map1.get(chaKey))
                return false;
        }

        return true;
    }
}
