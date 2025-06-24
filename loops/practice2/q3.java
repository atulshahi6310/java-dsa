import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();

       for(int i = 1 ; i<= 10 ; i++){
           int tab = a * i ;
           System.out.println(a + "*"+ i +"is " + tab);
       }
       num.close();
    }
}
