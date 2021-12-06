/* Write a Java Program that checks whether a given string is a palindrome or not. */
package exerciseone;

import java.util.Scanner;

public class PalindromeTwo{
    public static void main(String args[])
    {
        String user_input, t = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string:");
        user_input = s.nextLine();
        int n = user_input.length();
        for(int i = n - 1; i >= 0; i--)
        {
            t = t + user_input.charAt(i);
        }
        if(user_input.equalsIgnoreCase(t))
        {
            System.out.println("Palindrome.");
        }
        else
        {
            System.out.println("Non-Palindrome.");
        }
    }
}
