import java.util.*;

public class array1 {
    public static boolean search(int arr[]) {

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   return true;
                }
            }
        }
            return false;
    }
        public static void main( String args[]){
            int arr[] = {1,2,3,45,6,7,8,9,58};

            System.out.print("Contains duplicates? " + search(arr));

    }
}