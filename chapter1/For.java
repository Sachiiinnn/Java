package chapter1;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < arr.length; i++){
            // System.out.println(arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = n * i;
            System.out.println(sum);
        }
        // System.out.println(sum); for sum og n natural number
    }
}
