//Write a Java program that prompts the user for an integer and then prints out all the prime numbers 
//up to that Integer. 

package exerciseone;

/**
 * PrimeOne
 */
import java.util.Scanner;

public class PrimeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your range: ");
        int num = sc.nextInt();
        for (int i=2;i<=num;i++ ) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp <= 2) {
                System.out.println(i);
            }

        }
    }
}