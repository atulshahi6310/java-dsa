import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size1= sc.nextInt();
        int size2= sc.nextInt();

        int arr[][] = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();


        for (int i = 0; i < size1; i++) {
                        for (int j = 0; j < size2; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
        }
    }
}