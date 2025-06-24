import java.util.*;

public class largest{
    public  static  void  main(String args[]){
        Scanner num = new Scanner(System.in);
        int num1 =num.nextInt();
        int  num2 = num.nextInt();

        if (num1>num2){
            System.out.print(" the given num1: " + num1 +" is grater than the num 2:" + num2);
        } else{
            System.out.print(" the given num1: " + num1 +" is less  than the num 2:" + num2);
        }

        num.close();
    }

}