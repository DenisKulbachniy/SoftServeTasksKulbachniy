package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumOfWords = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How much lines u wanna have: ");
        int quantityOfLines = sc.nextInt();
        String array[] = new String[quantityOfLines];
        for (int i = 0; i < quantityOfLines ; i++) {
            System.out.println("Enter value");
            String value = sc.next();
            array[i] = value;
            sumOfWords += array[i].length();
        }
        System.out.println("String average length is: " + sumOfWords/quantityOfLines);
    }
}