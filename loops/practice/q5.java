import java.util.*;

public class q5 {
    public static void main(String args[]){
        Scanner  year = new Scanner(System.in);
        int a = year.nextInt();
        if (a == 0 ){
            System.out.print(" this is not a valid year ");
        } else if( a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            System.out.print("the year is a leap year ");
        }else {
            System.out.println("The year " + a + " is not a leap year.");
        }
        year.close();
    }
}