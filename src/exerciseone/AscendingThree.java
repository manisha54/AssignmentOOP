package exerciseone;
//Write a Java program for sorting a given list of names in ascending order
import java.util.Scanner;
import java.io.*;
public class AscendingThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbe of name you are writing: ");
        int num = sc.nextInt();
        String[] str = new String[num];
        System.out.println("Enter strings: ");
        for(int i = 0; i < num; i++)
        {
            str[i] = new String(sc.next());
        }
        for(int i = 0; i < num; i++)
        {
            for(int j = i+1; j < num; j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Sorted list of strings is:");
        for(int i = 0; i < num; i++)
        {
            System.out.println(str[i]);
        }
    }
}

