import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int fact = a ;
        if( a<0){
            System.out.print(" factorial for this number is not valid " + a );

        } else{
            for( int i = a-1 ; i >0; i--){
                fact *= i;
            }
        System.out.print(" the factoraila of numer "+ a + " is " + fact );
        }
        num.close();
    }
}
