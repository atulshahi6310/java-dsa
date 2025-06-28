import java.util.*;



public class str1 {
   public static boolean check ( String  strr){
       int n = strr.length();

       for (int i = 0; i < strr.length()/ 2; i++) {

            if(  strr.charAt(i) != strr.charAt(n-i-1)){
                return false;
            }

       }
       return true;
   }
    public static void main(String args[]){
       String  strr = "noon";
       System.out.println(strr);
        System.out.print(check(strr));
    }
}