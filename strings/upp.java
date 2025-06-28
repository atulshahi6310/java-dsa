//" i am a developer and a data sincitest

import java.util.*;

public class Upp {

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

    public static void main(String[] args) {
        String me = "i am a developer and a data scientist";
        String result = toUpperCaseWords(me);
        System.out.println(result);
    }
}
