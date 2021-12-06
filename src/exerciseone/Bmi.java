//Write a Java program to compute body massindex (BMI).
package exerciseone;
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the height in meter");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in kg");
        double weight = sc.nextDouble();

        double BMI = weight / (height*height) ;
        System.out.println("The BMI is " + BMI);
    }

}
