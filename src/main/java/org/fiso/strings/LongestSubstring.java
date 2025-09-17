package org.fiso.strings;

import java.util.HashMap;
import java.util.Map;

class LongestSubstring {

    public static void main(String[] args) {
       int res =  lengthOfLongestSubstring("pwwkew");
        System.out.println("Length == "+ res);
    }

    public  static  int lengthOfLongestSubstring(String s) {

        if(s.isEmpty())
            return 0;


        int res = 1;
        int currRes = 1;

        int i = 0;
        int j = 1;

        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 1);

        while (j <  s.length()){


            char atJ = s.charAt(j);
            Integer jFreq = map.get(atJ);



            if(jFreq == null ||  jFreq == 0 ){

                map.put(atJ, 1);
                currRes++;
                j++;


            }else if(jFreq == 1) {

                char atI = s.charAt(i);

                while(atI != atJ){
                    map.put(atI, 0);
                    i++;
                    atI = s.charAt(i);
                }

                i++;
                currRes = (j - i) + 1;
                j++;
            }


            if(currRes > res){
                res = currRes;
            }

        }

        return res;

    }


}

