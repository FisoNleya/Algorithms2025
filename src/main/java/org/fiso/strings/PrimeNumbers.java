package org.fiso.strings;

public class PrimeNumbers {

    public static void main(String ...args){

        int n = 30;
        for(int i = 0 ; i <= n; i++){
            if(isPrime(i))
                System.out.print(i+ " ,");

        }


    }


    //A prime number is a whole number greater than 1 whose only factors are 1 and itself.
    // The first ten primes are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29. It should be ...
    public static boolean isPrime(int n){

        if(n == 1) return false;

        int sqrt = (int)(Math.pow(n , 0.5));


        if((sqrt*sqrt) == n)
            return false;

        for(int i = 2 ; i <= sqrt ; i++){

            if((n % i)  == 0)
                return false;
        }

        return true;
    }




}
