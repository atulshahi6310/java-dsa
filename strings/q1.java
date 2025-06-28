import java.util.*;

public class q1{


    public static String toUpperCaseWords(String me) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(me.charAt(0)));

        for (int i = 1; i < me.length(); i++) {
            if (me.charAt(i - 1) == ' ' && me.charAt(i) != ' ') {
                sb.append(Character.toUpperCase(me.charAt(i)));
            } else {
                sb.append(me.charAt(i));
            }
        }

        return sb.toString();
    }

    public static int vol(String me) {

         int count = 0;
        for (int i = 0; i < me.length()- 1 ; i++) {
            char chr = me.charAt(i);
            if( chr == 'a' || chr == 'e' || chr == 'i' || chr =='o' || chr == 'u' ){
                count ++ ;

            }
        }

        return  count;

    }
    public static void main(String[] args) {
        String me = "Atul";
        toUpperCaseWords(me);
      System.out.print(vol(me));

    }
}
