import java.util.*;

public class compress {

    public static String  commpress(String me) {
        String str = " ";
        for (int i = 0; i < me.length(); i++) {
            Integer count = 1;
            while(i < me.length() -1 && me.charAt(i) == me.charAt(i +1)){
                count ++;
                i++;
            }
            str += me.charAt(i);
            if(count >1){
                str += count.toString();
            }
        }

        return str ;
    }

    public static void main(String[] args) {
        String me = "aaaabbbbawwwwwwerertyjtyffhgggfgfgfgfgffggffggffg";

        System.out.println(commpress(me));


    }
}
