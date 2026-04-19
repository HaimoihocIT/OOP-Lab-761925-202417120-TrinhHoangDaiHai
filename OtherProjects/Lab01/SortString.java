package Lab01;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++) System.out.print(arr[i] + " ");
        System.out.println("");
        System.out.println("Sum of array: " + sum);
        System.out.printf("Average value of array element: %.2f", (double)(sum/n));
        System.exit(0);
    }
}
