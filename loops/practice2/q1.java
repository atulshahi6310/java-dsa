import java.util.*;

public class q1 {
    public static void main(String[] args) {

        int n = 100;
        int evensum = 0, oddsum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddsum += i;
            }
        }

        System.out.println("The total sum of even numbers between 0 and " + n + " is: " + evensum);
        System.out.println("The total sum of odd numbers between 0 and " + n + " is: " + oddsum);
    }
}

