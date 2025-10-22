package org.fiso.strings;

public class StringCompression {

    public static void main(String[] args){
        String input = "aabbcccccaaa";
        System.out.println("The compressed result : "+ compressString(input));
    }

    public  static String compressString(String input){
        if(input.isEmpty())
            return input;

        StringBuilder res = new StringBuilder();
        char currChar = input.charAt(0);
        int count = 1;

        for(int i = 1; i < input.length(); i++){
            char iChar = input.charAt(i);
            if(iChar != currChar){
                res.append(currChar).append(count);
                count = 1;
                currChar = iChar;
            }else{
                count++;
            }
        }

        res.append(currChar).append(count);
        if(res.length() > input.length())
            return input;
        return res.toString();
    }

}
