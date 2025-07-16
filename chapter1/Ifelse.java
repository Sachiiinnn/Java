package chapter1;

import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int b = sc.nextInt();
        // if (age % 2 == 0) {
        if (age == b) {
            System.out.println("Equal");
        } else{
            if(age > b){
                System.out.println("Age is greater than b");
            }
            else {
                System.out.println("age is less than b");
            }
        }
    }
}
