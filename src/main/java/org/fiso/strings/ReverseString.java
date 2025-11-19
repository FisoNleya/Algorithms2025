package org.fiso.strings;

public class ReverseString {


    public static void main(String ...args){

        String s ="I just wanna go home, alone, without you.";
        System.out.println(s);
        String res =  reverse(s);
        System.out.println(res);

    }



    public static String reverse(String s){
        int a = 0;
        int b = s.length() - 1;
        int p =  (s.length()/ 2);
        int app = p;

        StringBuilder res = new StringBuilder(s.length());

        while(app >= 0 ){

            if(a < p)
             res.insert(a, s.charAt(b));
            res.append(s.charAt(app));

            b--;
            a++;
            app--;
        }

      return  res.toString();
    }

}
