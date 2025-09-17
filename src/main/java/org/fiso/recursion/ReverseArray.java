package org.fiso.recursion;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        reverseArray(arr);

    }

    public static  void reverseArray(int[] arr){
       int index = arr.length - 1;
        reverse(arr, index -1);
    }

    public static void reverse(int[] arr, int index){
        if(index < 0)
            return;
        System.out.println(arr[index]);
        reverse(arr, index -1);
    }
}



