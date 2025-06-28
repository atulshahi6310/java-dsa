import java.util.*;

public class alg{

    public static String  anagrams(String st1 , String  st2) {


        if(st1.length() != st2.length()){
          return "not a anagrams";
        }
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();

        char ch1[]= st1.toCharArray();
        char ch2[]= st2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            return "Anagrams";
        } else {
            return "Not Anagrams";
        }
    }



    public static void main(String[] args) {
        String st1 = "race" ;
        String st2 = "care";

        System.out.println(anagrams(st1, st2));

    }
}
