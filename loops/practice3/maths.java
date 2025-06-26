import java.util.*;

public class maths {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print(" enter the number :");
        int a = num.nextInt();

        double b = Math.sqrt(a);
        System.out.println(" enter the sqr of number :" + b);

        double w = Math.pow(a , 10);
        System.out.println(" enter the power of number :" + w);
        num.close();
    }
}