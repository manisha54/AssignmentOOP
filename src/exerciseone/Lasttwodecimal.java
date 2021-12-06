//Write a Java program that accepts two floating-point numbers and checks whether they are the same
//up to two decimal places.
package exerciseone;

import java.util.Scanner;
public class Lasttwodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first float number:");
        float fnum1 = sc.nextFloat();
        System.out.println("enter the second float number:");
        float fnum2 = sc.nextFloat();

        if (Math.abs(fnum1 - fnum2) <= 0.01){
            System.out.println("same number");
        }
        else{
            System.out.println("different number.");
        }

    }

}
