import java.util.*;

public class rev {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print(" enter the number :");
        int a = num.nextInt();
        int b =0 ;
        while (a != 0){
           int digit =  a %10;
           b += digit;
           a /=10;
        }

        System.out.print(b);
    }
}