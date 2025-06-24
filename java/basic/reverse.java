import java.util.*;

public class reverse{
    public  static  void  main(String args[]){
        Scanner num = new Scanner(System.in);
        int num1 =num.nextInt();

        int num2 = 0;
        while (num1 > 0){
         int lastdigit = num1%10;

         num2 = (num2 * 10) + lastdigit ;
         num1  = num1/10;
        }
     System.out.println(num2);
        num.close();
    }

}