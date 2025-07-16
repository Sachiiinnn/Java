package basic;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //variables

        // String name = "Sachin";
        int age = 20;
        int a = 25;
        int b = 10;
        double price = 25.25;

        b = 40;
        // name = "Richa";

        int sum = a + b;
        // System.out.println(sum);
        int diff = a- b;
        // System.out.println(diff);
        int mul = a * b;

        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String name = sc.nextInt();
        // String name = sc.nextFloat();
        String name = sc.nextLine();
        System.out.println(name);
    }
}