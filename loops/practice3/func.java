import java.util.*;

public class func{

    public static int avg( int a , int b, int c){
        int avgrage = (a+b+c)/3;

        return avgrage;
    }

    public static String numType(int d) {
        if (d == 0) {
            return "The given number is zero";
        } else if (d % 2 == 0) {
            return "The given number is even";
        } else {
            return "The given number is odd";
        }
    }



    public static String palindrome(int e) {
        int orignal = e ;
        int reverse = 0 ;
       while (e != 0){
     int  x = e % 10;
          reverse = reverse * 10 + x;
          e /=10 ;
       }

        if (orignal == reverse) {
            return orignal + " is a palindrome";
        } else {
            return orignal + " is not a palindrome";
        }
    }

    public static void main(String args[]){


        System.out.println("the given number is  :" + palindrome(111));


    }
}