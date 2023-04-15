import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = keyboard.nextInt();
        int[] my_array1 = new int[n];

        for(int i = 0; i < n; i ++) {
            System.out.print("Enter num "+ (i + 1) +": ");
            my_array1[i] = keyboard.nextInt();
        }

        Arrays.sort(my_array1);

        System.out.println(Arrays.toString(my_array1));
    }
}