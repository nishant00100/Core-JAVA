package JavaPracticeProblems;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("first number: ");
        int num1 = sc.nextInt();

        System.out.print("second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum : " + sum);
    }
}
