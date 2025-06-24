import java.util.*;

public class q3 {
    public static void main(String args[]){
        Scanner day = new Scanner(System.in);
        System.out.print(" enter the day number :");
        int a = day.nextInt();

        switch (a){
            case 1:  System.out.print(" sunday ");
            break;
            case 2:  System.out.print(" monday ");
                break;
            case 3:  System.out.print(" tuesday ");
                break;
            case 4 : System.out.print("  wednesday");
                break;
            case 5:  System.out.print(" Thursday ");
                break;
            case 6:  System.out.print("  friday");
                break;
            case 7:  System.out.print(" saturday ");
                break;
            default: System.out.print(" this day is not exist in this universe ");
        }
          day.close();
    }
}