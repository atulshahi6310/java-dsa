import java.util.*;

public class even{
    public  static  void  main(String args[]){
        Scanner num = new Scanner(System.in);
        int num1 =num.nextInt();
        int  num2 = num.nextInt();
        if(num1 == 0){
            System.out.print(" the given number is  0 ");
        } else if (num1%2 == 0) {
            System.out.print(" the given number is  even ");
        } else {
            System.out.print(" the given number is  odd ");
        }

        num.close();
    }

}