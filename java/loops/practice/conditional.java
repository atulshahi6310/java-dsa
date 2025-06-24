//Question1:WriteaJavaprogramtogetanumberfromtheuser and printwhetheritispositive or negative.
import java.util.*;
public class conditional {
    public static void main (String args[]){
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();

        if(a >0 ){
            System.out.print(" the given number " + a + " is positive ");

        }else if(a<0) {
            System.out.print(" the given number " + a + " is negative ");
        } else {
            System.out.print(" the given number " + a + " is nither negative nor positive  ");
        }
            number.close();
    }
}