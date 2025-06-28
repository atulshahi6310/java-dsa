import java.util.*;



public class dir{

    public static void main(String args[]){


        String  strr = "racecar";
        Scanner sc =  new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();

        String  sub = "";
        for(int i = st; i<end ; i++){
            sub += strr.charAt(i);
        }
        System.out.print(sub);
    }
}