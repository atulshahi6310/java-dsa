import java.util.*;

public class a {
    public static void main(String[] args ){
        Scanner num = new Scanner(System.in);
        System.out.print(" enter the number :");
        int n  = num.nextInt();

        for (int i = 1; i <= n; i++) {
            for( int j = 1 ; j <= n ; j++ ){
                if( i==1 || i == n || j == 1 || j == n ){
                    System.out.print(" *");

                } else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}