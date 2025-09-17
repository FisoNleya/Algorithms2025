package org.fiso.array;

public class ArrayManipulation {

    public static void main(String[] args) {


        int[] arr1 = {1,3,4,7,9, 19};
        int[] arr2 = {0,4,6,9, 12, 19};

        //# of common elements : 1
        System.out.println("The count is : "+ numberOfCommonElements(arr1, arr2));
    }

    public static  int numberOfCommonElements(int[] arr1, int[] arr2){

        // use map , then check frequency
        //

        int count = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length){

            if(arr1[i] == arr2[j]){
                count++;
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }else {
                i++;
            }

        }

        return count;
    }


}
