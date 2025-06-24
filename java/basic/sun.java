import java.util.*;

public class sun{
    public  static  void  main(String args[]) {

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        for ( int i = 1;  i <=n; i++) {
            sum += i;
        }
            System.out.println( " the sum of given n "+n+" natural number is :" + sum);
        num.close();
    }
}