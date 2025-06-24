import java.util.*;

public class grade{
    public  static  void  main(String args[]){
        Scanner num = new Scanner(System.in);
        int marks_percent =num.nextInt();

        if (marks_percent >=90){
            System.out.print("you are score is very good and you got " + marks_percent + " percent ");
        } else if (marks_percent>=75 && marks_percent < 90 ) {
            System.out.print("you are score is  good and you got " + marks_percent + " percent ");
        } else {
            System.out.print("you are is not so good  and you got " + marks_percent + " percent ");
        }
    num.close();
    }

}