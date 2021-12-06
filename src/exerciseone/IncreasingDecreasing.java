//Write a Java program that accepts three numbers from the user and prints "increasing" if the numbers
//are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing
// or decreasing order" otherwise.
package exerciseone;
import java.util.Scanner;
public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int first = sc.nextInt();

        System.out.print("Enter the second number:");
        int second = sc.nextInt();

        System.out.print("Enter the third number:");
        int third = sc.nextInt();

        if (first < second && second < third){
            System.out.println("It's in increasing order");
        }
        else if (first > second && second > third){
            System.out.println("It's in decreasing order.");
        }
        else {
            System.out.println("neither increasing or decreasing.");
        }

    }
}
