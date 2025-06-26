import java.util.*;

public class sorting {
    public static void sort(int arr[]) {

        //bubble sort print all  in DESCENDING order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    //selection sort

    public static void slect(int arr[]) {
        for (int i = 0; i < arr.length - 2; i++) {
            int minpostion = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minpostion]) {
                    minpostion = j;
                }
            }

            int temp = arr[minpostion];
            arr[minpostion] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort

    public static void insertion(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = current;


        }
    }
        public static void print(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }



  public static void main(String args[]){
        int arr[] ={1,2,3,52,4,8,6,7,9,-8};
         insertion(arr);
         print(arr);

  }

}