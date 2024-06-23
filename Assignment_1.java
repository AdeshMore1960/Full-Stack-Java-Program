import java.util.Scanner;

/**
 * Assignment_1
 */
public class Assignment_1 {

    public static void main(String[] args) {

        // Question 1 : Write a Java Program to print '1. Hello' on screen and your name
        // on a separate line.
        System.out.println("Hello \nAdesh More");

        // Question 2 : Write a Java program to print the sum of two numbers.
        int num1 = 74, num2 = 36;
        int sum = num1 + num2;

        System.out.println(sum);

        // Question 3 : Write a Java program to divide two numbers and print them on the
        // screen.
        int num3 = 50, num4 = 3;
        int div = num3 / num4;

        System.out.println(div);

        // Question 4 : Write a Java program to print the results of the following
        // operations.
        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
        System.out.println("(55+9) % 9 = " + ((55 + 9) % 9));
        System.out.println("20 + -3*5 / 8 = " + (20 + -3 * 5 / 8));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));

        // Question 5 : Write a Java program that takes two numbers as input and
        // displays the product
        // of two numbers.
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Enter first number : ");
        n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        n2 = sc.nextInt();

        System.out.println(n1 + "x" + n2 + " = " + n1 * n2);

        // Question 6 : Write a Java program to display the following pattern.
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a ");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

    }
}