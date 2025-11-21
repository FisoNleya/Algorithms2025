package org.fiso.strings;

public class RotateMatrix {

    public static void main(String... args) {

//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrix = {{1, 2, 3,4}, {4, 5, 6,4}, {7, 8, 9,4},  {7, 8, 9,4}};
        int[][] matrix = {{1, 2, 3,4, 6}, {4, 5, 6,4,6}, {7, 8, 9,4,6},  {7, 8, 9,4,6}, {5, 5, 5, 5, 5}};
        print(matrix);
        /**
         * 1.7 Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
         * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
         *
         * 123
         * 456
         * 789
         *
         *
         * 7 4 1
         * 8 5 2
         * 9 6 3
         *
         * 1234
         * 5689
         * 1234
         * 5678
         *
         * 5151
         * 6262
         * 7383
         * 8494
         *
         *           45151
         *           56262
         *          *67383
         *          *78494
         *           78978
         *
         * */

        int len = matrix[0].length;
        rotateMatrix(matrix, len, 0);

        System.out.println("----------------");
        print(matrix);
    }

    public static void rotateMatrix(int[][] matrix, int len, int o){

        if(len <= 1)
            return;


        for(int i = o , j = 0; i < len-1; i++, j++){

              int temp =  matrix[i][len -1];
              matrix[i][len -1] = matrix[o][i];
              //|

              // <--
              int temp2 = matrix[len - 1][len -(1+j)];
              matrix[len - 1][len -(1+j)] = temp;

              //1
              temp = matrix[len - (1+j)][(o)];
              matrix[len - (1+j)][(o)] = temp2;

              //->
              matrix[o][(i)] = temp;
        }

        rotateMatrix(matrix, len-1, o+1);

    }

    public static void print(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j <  matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }



}

