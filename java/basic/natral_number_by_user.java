import java.util.*;

public class natral_number_by_user{
    public  static  void  main(String args[]) {

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for ( int i = 1;  i <=n; i++) {

            System.out.println( i);
        }
       num.close();
    }
}