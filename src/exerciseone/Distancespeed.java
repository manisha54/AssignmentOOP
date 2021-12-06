//Write a Java program to takes the user for a distance (in meters) and the time was taken(as three
//numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
//and miles per hour (hint: 1 mile = 1609 meters).Example
//Input distance in meters: 2500
//Input hour:5
//Input minutes: 56
//Input seconds: 23
//Expected Output:Your speed in meters/second is 0.11691531.
//Your speed in km/h is 0.42089513Your speed in miles/h is 0.26158804
package exerciseone;
import java.util.Scanner;
public class Distancespeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in meters");
        double distance = sc.nextDouble();
        System.out.println("Enter the hour");
        double time_hour = sc.nextDouble();
        System.out.println("Enter the minutes");
        double time_minutes = sc.nextDouble();
        System.out.println("Enter the seconds");
        double time_seconds = sc.nextDouble();


        double timeSeconds = (time_hour*3600) + (time_minutes*60) + time_seconds;

        double meter_per_seconds = distance / timeSeconds;
        System.out.println("Speed is" + meter_per_seconds);

        double kilometers_per_hour = ( distance/1000 ) / ( timeSeconds/3600 );
        System.out.println("Speed is" + kilometers_per_hour);

        double meter_per_hour = kilometers_per_hour / 1.609;
        System.out.println("Speed is " + meter_per_hour);

    }
}
