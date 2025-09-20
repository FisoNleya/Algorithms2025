package org.fiso.strings;

import java.util.Arrays;

public class UniqueChars {

    public static void main(String[] args) {

        String str = "abcdefxx";
        System.out.println("Has unique: "+ hasUnique(str));
    }

    public static  boolean hasUnique(String s){
        char[] arr = s.toCharArray();

        char a;
        char b;

        Arrays.sort(arr);

        boolean hasDuplicate = false;

        int i = 1;
        while (i < s.length()){
            a = arr[i - 1];
            b = arr[i];
            if((a-'a') == (b-'a'))
                hasDuplicate = true;

            i++;
        }

        return  !hasDuplicate;

    }
}
