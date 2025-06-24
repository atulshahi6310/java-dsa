import java.util.*;

public class area {
    public static void main(String args[]){
          Scanner num = new Scanner(System.in);
        System.out.print( " enter the radius of the circle :");
          float rad = num.nextFloat();
          float area = 3.14f *rad*rad;
          System.out.print("area of the circle is :" + area);
    }
}