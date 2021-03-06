package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First operand: ");
        int operand1 = sc.nextInt();
        System.out.print("Second operand: ");
        int operand2 = sc.nextInt();
        System.out.print("Symbol: ");
        String operation = sc.next();

        switch (operation) {
            case "+":
                add(operand1, operand2);
                break;
            case "-":
                sub(operand1, operand2);
                break;
            case "*":
                mul(operand1, operand2);
                break;
            case "/":
                div(operand1, operand2);
                break;
            default:
                System.out.println("Unknown operation! ");
        }
    }

    public static void add(int operand1, int operand2) {
        System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
    }

    public static void sub(int operand1, int operand2) {
        System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
    }

    public static void mul(int operand1, int operand2) {
        System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
    }

    public static void div(int operand1, int operand2) {
        if (operand2 == 0) {
            System.out.println("It is forbidden to divide by 0");
        }
        System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
    }
}